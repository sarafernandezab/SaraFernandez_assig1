import junit.framework.TestCase;

public class testWordsChecker extends TestCase{

	public void testLetterCounter(){
		LetterCounter l = new LetterCounter();
		int result = l.VowelCounter("testing");
        assertEquals(2, result);
	}
	
	public void testConsonantCounter(){
		LetterCounter l = new LetterCounter();
		int result = l.ConsonantCounter("testingCons");
		assertEquals(8, result);
	}
}
