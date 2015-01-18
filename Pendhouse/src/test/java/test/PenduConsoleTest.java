package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classeDialogue.PenduConsole;
import classeMetier.*;

public class PenduConsoleTest {
	PenduConsole pc ;
	@Before
	public void setUp() throws Exception {
		pc= new PenduConsole();
	}

	@After
	public void tearDown() throws Exception {
		pc=null;
	}

	@Test
	public void test() {
		assertEquals("PenduConsole [joueur=Joueur [vie=0, lettre=Lettre [lettre= ]], dictionnaire=Dictionnaire [mots=[]], trouve=null]",pc.toString());
		Joueur j = new Joueur();
		j.setVie(5);
		Lettre l = new Lettre('j');
		j.setLettre(l);
		pc.setJoueur(j);
		assertEquals("PenduConsole [joueur=Joueur [vie=5, lettre=Lettre [lettre=j]], dictionnaire=Dictionnaire [mots=[]], trouve=null]",pc.toString());
	}

}
