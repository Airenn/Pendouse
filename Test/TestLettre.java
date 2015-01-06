package Test;
import classeMetier.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLettre {
	 @Test
	    public void canConstructALettreWithAName() {
	        Lettre lettre = new Lettre('c');
	        assertEquals('c', lettre.getLettre());
	    }
	 @Test
	 public void canSetALettre(){
		 Lettre lettre = new Lettre();
		 assertEquals(' ',lettre.getLettre());
		 lettre.setLettre('c');
		 assertEquals('c',lettre.getLettre()); 
	 }
	 @Test
	 public void BooleanLettre(){
		 Lettre lettre = new Lettre();
		 lettre.setLettre('a');
		 assertEquals(lettre.verifierLettreDansMot("salut"),true);
		 lettre.setLettre('v');
		 assertEquals(lettre.verifierLettreDansMot("salut"),false);
	 }
	 
}
