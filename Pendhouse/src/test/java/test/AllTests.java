package test;

import org.junit.runner.*;
import org.junit.runner.notification.*;
import org.junit.runners.*;
import org.junit.runners.Suite.*;

@RunWith(Suite.class)
@SuiteClasses({ DictionnaireTest.class, JoueurTest.class, LettreTest.class,PenduConsoleTest.class })
public class AllTests {
	public static void main (String[] args){
		Result result = JUnitCore.runClasses(JoueurTest.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure);
		}
	}
}
