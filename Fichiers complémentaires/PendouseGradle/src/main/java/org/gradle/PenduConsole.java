package org.gradle;

import java.util.*;
import org.gradle.*;

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
		System.out.println("PENDOUSE");
		System.out.println("--------------------------------");
		System.out.println("Saissisez votre choix :");
		System.out.println("1.Jouez");
		System.out.println("2.Entrez un nouveau mot");
		System.out.println("3.Suprimer un mot deja existant");
		System.out.println("4.Quitter");
		int str = sc.nextInt();
		System.out.println("Vous avez saisi : " + str);
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
				System.out.println("Entrer le mot a ajouter:");
				String s = sc.next();
				this.dictionnaire.ajouterMot(s);
				this.menu();
				break;
	
			case 3:
				String motsup = sc.next();
				this.dictionnaire.supprimerMot(motsup);
				this.menu();
				break;
				
			case 4:
				System.exit(0);
				break;
			}
	
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
					System.out.println("BRAVO LE VEAU");
				}
				else{
					System.out.println("Dommage vous perdez une vie !");
					this.getJoueur().pointVie();
					}
		}
		if(this.joueur.getVie() == 0)
			System.out.println("Vous avez perdu !");
		if(this.gagne() == true)
			System.out.println("Vous avez gagné des cookies !");
	
	}
	
	public boolean verifierLettre(String mot){
		if(this.joueur.getLettre().verifierLettreDansMot(mot)){
			int i = mot.indexOf((char)this.joueur.getLettre().getLettre());
			trouve[i] = 1;
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
		p.menu();
	}
	
}