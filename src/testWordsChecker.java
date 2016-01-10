import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

import java.util.LinkedList;

import junit.framework.TestCase;

public class TestWordsChecker extends TestCase{
	//symbols or spaces are not taken into account in this checker
	
	WordsChecker w = new WordsChecker();

	public void testVowelCounter(){
		int result = w.VowelCounter("testingVow, & twowords");
        assertEquals(5, result);
	}
	
	public void testConsonantCounter(){
		int result = w.ConsonantCounter("testingCons $three words");
		assertEquals(15, result);
	}

	public void testPalindromeChecker(){
		boolean result = w.PalindromeChecker("Amo.re Ro(ma");
		assertEquals(true, result);
	}
	
	public void testForExpectedExceptionNullInputVowels() throws Exception {
	    try {
	        w.VowelCounter (null);
            fail("This should have thrown an exception");

        } catch (IllegalArgumentException e) {
            //test passed
        }
	}
	
	public void testForExpectedExceptionNullInputConsonants() throws Exception {
	    try {
	        w.ConsonantCounter (null);
            fail("This should have thrown an exception");

        } catch (IllegalArgumentException e) {
            //test passed
        }
	}
	
	public void testForExpectedExceptionNullInputPalindrome() throws Exception {
	    try {
	        w.PalindromeChecker (null);
            fail("This should have thrown an exception");

        } catch (IllegalArgumentException e) {
            //test passed
        }
	}
	
}
