import java.util.*;

public class PenduConsole
{
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
		this.joueur = joueur;
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
					System.out.print("_.");
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
		PenduConsole p=new PenduConsole();
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		System.out.println("PENDOUSE");
		System.out.println("--------------------------------");
		System.out.println("Saissisez votre choix :");
		System.out.println("1.Jouez");
		System.out.println("2.Entrez un nouveau mot");
		System.out.println("3.Suprimer un mot deja existant");
		System.out.println("Vous avez saisi : " + str);
			switch(str){
			
			case 1:
				this.jouer();
				break;	
	
			case 2:
				String s = sc.nextLine();
				this.dictionnaire.ajouterMot(s);
				break;
	
			case 3:
				String motsup = sc.nextLine();
				this.dictionnaire.supprimerMot(motsup);
				break;
			}
	
		}
	
	public void jouer(){
		Scanner sc = new Scanner(System.in);
		String mot= this.getDictionnaire().motAleatoire();
		this.trouve = new int[mot.length()];
		System.out.println("--------------------------------");
		System.out.println("LA PARTIE COMMENCE");
		while(this.getJoueur().getVie()>0){
			System.out.println("VOICI LE MOT :");
			this.afficherMot(mot);
			System.out.println("Vous avez :"+this.getJoueur().getVie()+" Vies");
			System.out.println("Entrez une lettre :");
			Lettre str = new Lettre(sc.nextLine());
			this.joueur.setLettre(str);
				if(this.joueur.getLettre().verifierLettreDansMot(mot)){
					System.out.println("BRAVO LE VEAU");
				}
				else{
					System.out.println("Dommage vous perdez une vie !");
					this.getJoueur().setVie(this.getJoueur().pointVie());
					}
		}	
	
	}
}