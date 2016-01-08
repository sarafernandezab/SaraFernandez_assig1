import junit.framework.TestCase;

public class testWordsChecker extends TestCase{

	public void testVowelCounter(){
		WordsChecker l = new WordsChecker();
		int result = l.VowelCounter("testingVow twowords");
        assertEquals(5, result);
	}
	
	public void testConsonantCounter(){
		WordsChecker l = new WordsChecker();
		int result = l.ConsonantCounter("testingCons three words");
		assertEquals(15, result);
	}
	
}
