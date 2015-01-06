package org.gradle;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.gradle.*;
import org.junit.Test;
import classeMetier.*;

public class DictionnaireTest {
	@Test
	public void canConstructADictionnaireWithAName(){
		Dictionnaire d = new Dictionnaire();
		d.ajouterMot("salut");
		assertEquals("salut", d.getMots().get(0));
	}
}
