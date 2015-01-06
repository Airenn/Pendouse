package org.gradle;
import org.apache.commons.collections.list.GrowthList;
import static org.junit.Assert.*;
import org.junit.Test;

import org.gradle.src.classeDialogue.PenduConsole;

public class PenduConsoleTest {

	@Test
	public void test() {
		PenduConsole p= new PenduConsole();
		assertEquals(0,p.getJoueur().getVie());
	}

}
