package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classeMetier.Dictionnaire;

public class DictionnaireTest {
	private Dictionnaire dico;
	@Before
	public void setUp() throws Exception {
		System.out.println("Test de la classe Dictionnaire ...");
		dico= new Dictionnaire();
	}
	
	@After
	public void tearDown() throws Exception {
		dico=null;
		System.out.println("Test de la classe Dictionnaire fait.");
	}
	
	@Test
	public void test(){
		dico.ajouterMot("Salut");
		assertEquals("Dictionnaire [mots=[Salut]]",dico.toString());
		dico.ajouterMot("Bye");
		assertEquals("Dictionnaire [mots=[Salut, Bye]]",dico.toString());
		String var = dico.supprimerMot("Bye");
		assertNotNull("Bye",var);
		assertEquals("Dictionnaire [mots=[Salut]]",dico.toString());
		dico.ajouterMot("Bye");
		assertNotNull("Bye",dico.supprimerMot("Bye"));
		ArrayList<String> al= new ArrayList<String>();
		al.add("Salut");
		al.add("Bye");
		dico.setMots(al);
		assertEquals(al,dico.getMots());
		assertTrue("",dico.verifierMotAjout("CcCvToa"));
		assertFalse("",dico.verifierMotAjout("Salut"));
		assertTrue("",dico.verifierMotSuppr("Salut"));
		assertFalse("",dico.verifierMotSuppr("CcCvToa"));
		assertNull("",dico.supprimerMot("CcCvToa"));
		String s = dico.toString();
		dico.ajouterMot("Salut");
		assertEquals(s,dico.toString());
	}
	
	@Test
	public void randomTest(){
		dico.ajouterMot("Salut");
		assertEquals("Salut",dico.motAleatoire());
		dico.ajouterMot("Bye");
		String mot = dico.motAleatoire();
		String motRecup;
		if(mot=="Salut")
			motRecup="Salut";
		else
			motRecup="Bye";
		assertEquals(motRecup,mot);			
	}
	
}