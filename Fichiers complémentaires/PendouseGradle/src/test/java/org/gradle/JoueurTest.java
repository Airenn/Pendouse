package org.gradle;
import org.gradle.*;

import org.junit.Test;

import static org.junit.Assert.*;
public class JoueurTest{
	 @Test
	    public void canConstructAPlayerWithAName() {
	        Joueur j = new Joueur(5);
	        assertEquals(5, j.getVie());
	    }

}
