package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classeMetier.*;
public class JoueurTest {
	private Joueur j ;
	private Lettre lettre;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Test de la classe Joueur ...");
		j = new Joueur();
		lettre = new Lettre();
	}

	@After
	public void tearDown() throws Exception {
		j=null;
		System.out.println("Test de la classe Joueur fait.");
	}

	@Test
	public void vieTest() {
		j.setVie(5);
		assertEquals(5,j.getVie());
		assertEquals("Joueur [vie=5, lettre=Lettre [lettre= ]]",j.toString());
		j.pointVie();
		assertEquals(4,j.getVie());
	}
	@Test
	public void lettreTest(){
		j.setLettre(null);
		assertNull("null",j.getLettre());
		lettre.setLettre('a');
		j.setLettre(lettre);
		assertEquals('a',lettre.getLettre());
	}	
	@Test
	public void deuxVieTest(){
		vieTest();
		assertEquals("Joueur [vie=4, lettre=Lettre [lettre= ]]",j.toString());
	}
	@Test
	public void deuxLettreTest(){
		lettreTest();
		assertEquals("Joueur [vie=0, lettre=Lettre [lettre=a]]",j.toString());
	}
	
}