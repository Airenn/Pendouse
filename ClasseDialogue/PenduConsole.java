package classeDialogue;

import java.util.*;

import classeMetier.*;

public class PenduConsole{
	private Joueur joueur;
	private Dictionnaire dictionnaire;
	private int trouve[];
	
	public PenduConsole(){
		this.joueur=new Joueur();
		this.dictionnaire=new Dictionnaire();
		this.trouve=null;
	}
	
	
	public Joueur getJoueur() {
		return joueur;
	}


	public void setJoueur(Joueur j) {
		this.joueur = j;
	}


	public Dictionnaire getDictionnaire() {
		return dictionnaire;
	}


	public void setDictionnaire(Dictionnaire d) {
		this.dictionnaire = d;
	}


	public void afficherMot(String mot)
	{		
		for(int i = 0; i < mot.length(); i++)
		{
			if(this.trouve[i] == 0)
			{
				if(i == mot.length()-1)
					System.out.println("_");
				else
					System.out.print("_ ");
			}
			else
			{
				if(i == mot.length()-1)
					System.out.println(mot.charAt(i));
				else
					System.out.print(mot.charAt(i));
			}
		}
	}
	
	public void menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Saissisez votre choix :");
		System.out.println("1.Jouez");
		System.out.println("2.Entrez un nouveau mot");
		System.out.println("3.Supprimer un mot deja existant");
		System.out.println("4.Quitter");
		int str = 0;
		try{
			str = sc.nextInt();
		}catch(Exception e){
			System.out.println("Entrez un chiffre !\n");
			this.menu();
		}
			switch(str){
			
			case 1:
				try{
				this.jouer();
				}catch(Exception e){
					System.out.println("Aucun mot dans le dico");
					this.menu();			
				}
				break;	
	
			case 2:
				System.out.println("\nLes mots présents sont :\n"+this.dictionnaire);
				System.out.println("\nEntrez le mot a ajouter:");
				String s = sc.next();
				this.dictionnaire.ajouterMot(s.toUpperCase());
				System.out.println(this.dictionnaire+"\n\n\n\n\n");
				this.menu();
				break;
	
			case 3:
				System.out.println("\nChoisissez le mot à supprimer dans cette liste :\n"+this.dictionnaire);
				String motsup = sc.next();
				this.dictionnaire.supprimerMot(motsup);
				System.out.println(this.dictionnaire+"\n");
				this.menu();
				break;
				
			case 4:
				System.out.println("Au revoir !");
				System.exit(0);
				break;
			
			default:
				System.out.println("Entre un nombre de la liste !\n");
				this.menu();
			}
			sc.close();
		}
	
	public void jouer(){
		Scanner sc = new Scanner(System.in);
		String mot= this.getDictionnaire().motAleatoire();
		this.trouve = new int[mot.length()];
		this.joueur.setVie(5);
		System.out.println("--------------------------------");
		System.out.println("LA PARTIE COMMENCE");
		while(this.getJoueur().getVie()>0 && this.gagne()!=true){
			System.out.println("VOICI LE MOT :");
			this.afficherMot(mot);
			System.out.println("Vous avez :"+this.getJoueur().getVie()+" Vies");
			System.out.println("Entrez une lettre :");
			Lettre str = new Lettre(sc.next().charAt(0));
			this.joueur.setLettre(str);
				if(verifierLettre(mot)){
					System.out.println("\nBRAVO LE VEAU\n");
				}
				else{
					System.out.println("\nDommage vous perdez une vie !\n");
					this.getJoueur().pointVie();
					}
		}
		if(this.joueur.getVie() == 0){
			System.out.println("\nVous avez perdu !");
			System.out.println("Le mot était : " + mot + "\n");
			this.menu();
        }
		if(this.gagne() == true){
			System.out.println("\nVous avez gagné des cookies !");
			System.out.println("Le mot était : " + mot + "\n");
			this.menu();
        }
		sc.close();
	}
	
	public boolean verifierLettre(String mot){
		if(this.joueur.getLettre().verifierLettreDansMot(mot)){
			for(int i = 0; i < mot.length(); i++)
			{
				if(mot.charAt(i)==this.joueur.getLettre().getLettre())
					trouve[i] = 1;
			}
			return true;
		}
		
		return false;
	}
	
	public boolean gagne()
	{
		boolean ui = true;
		for(int i = 0; i < trouve.length;i++)
		{
			if(trouve[i] == 0)
				ui = false;
		}
		return ui;
	}
	
	public static void main(String[] args){
		PenduConsole p=new PenduConsole();
		System.out.println("PENDOUSE");
		System.out.println("--------------------------------");
		p.menu();
	}
	
}