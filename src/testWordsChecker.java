import junit.framework.TestCase;

public class testWordsChecker extends TestCase{

	public void testLetterCounter(){
		LetterCounter l = new LetterCounter();
		int result = l.VowelCounter("testing");
        assertEquals(2, result);
	}
	
}
