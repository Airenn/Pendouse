package Test;
import static org.junit.Assert.*;
import org.junit.Test;
import ClasseDialogue.*;
import ClasseMetier.*;

public class PenduConsoleTest {

	@Test
	public void test() {
		PenduConsole p= new PenduConsole();
		assertEquals(0,p.getJoueur().getVie());
	}

}

