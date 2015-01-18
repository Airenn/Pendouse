package test;

import static org.junit.Assert.*;

import org.junit.*;

import classeMetier.*;

public class LettreTest {
	private Lettre l;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Test de la classe Lettre ...");
		l = new Lettre();
	}

	@After
	public void tearDown() throws Exception {
		l=null;
		System.out.println("Test de la classe Lettre fait.");
	}

	@Test
	public void test() {
		l.setLettre('a');
		assertFalse("",l.verifierLettreDansMot("bnr"));
		assertTrue("",l.verifierLettreDansMot("salut"));
		assertEquals('a',l.getLettre());
	}
	
	@Test
	public void constructorLettreTest(){
		l=new Lettre('b');
		assertEquals('b',l.getLettre());
	}

}
