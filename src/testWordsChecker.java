import junit.framework.TestCase;

public class testWordsChecker extends TestCase{

	public void testLetterCounter(){
		LetterCounter l = new LetterCounter();
		int result = l.VocalCounter("testing");
        assertEquals(2, result);
	}
	
}
