package Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import ClasseMetier.*;
import org.junit.Test;

public class DictionnaireTest {
	@Test
	public void canConstructADictionnaireWithAName(){
		ArrayList mots = new ArrayList();
		mots.add("Salut");
		Dictionnaire d = new Dictionnaire(mots);
		assertEquals(mots.contains("Salut"), d.getMots());
	}
}
