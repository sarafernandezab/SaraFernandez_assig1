import static org.junit.Assert.assertThat;
import junit.framework.TestCase;

public class TestWordsChecker extends TestCase{
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
	
	public void testForExpectedExceptionNullInputVowels() throws Exception {
	    try {
			WordsChecker w = new WordsChecker();
	        w.VowelCounter (null);
            fail("This should have thrown an exception");

        } catch (IllegalArgumentException e) {
            //test passed
        }
	}
	
	public void testForExpectedExceptionNullInputConsonants() throws Exception {
	    try {
			WordsChecker w = new WordsChecker();
	        w.ConsonantCounter (null);
            fail("This should have thrown an exception");

        } catch (IllegalArgumentException e) {
            //test passed
        }
	}
}
