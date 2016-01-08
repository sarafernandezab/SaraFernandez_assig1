import junit.framework.TestCase;

public class testWordsChecker extends TestCase{

	public void testVowelCounter(){
		LetterCounter l = new LetterCounter();
		int result = l.VowelCounter("testingVow twowords");
        assertEquals(3, result);
	}
	
	public void testConsonantCounter(){
		LetterCounter l = new LetterCounter();
		int result = l.ConsonantCounter("testingCons three words");
		assertEquals(8, result);
	}

}
