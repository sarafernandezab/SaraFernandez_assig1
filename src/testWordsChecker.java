import junit.framework.TestCase;

public class testWordsChecker extends TestCase{
	//symbols or spaces are not taken into account in this checker

	public void testVowelCounter(){
		WordsChecker w = new WordsChecker();
		int result = w.VowelCounter("testingVow, & twowords");
        assertEquals(5, result);
	}
	
	public void testConsonantCounter(){
		WordsChecker w = new WordsChecker();
		int result = w.ConsonantCounter("testingCons $three words");
		assertEquals(15, result);
	}

	public void testPalindromeChecker(){
		WordsChecker w = new WordsChecker();
		boolean result = w.PalindromeChecker("Amo.re Ro(ma");
		assertEquals(true, result);
	}

}
