import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestStringChecked {

	StringChecked s;
	
    @Before
    public void setUp() {
    	s = new StringChecked();
        s.setString("Test tube butt set.");
        s.setPalindrome(true);
        s.setVowel(5);
        s.setConsonant(10);
    }
    
	@Test
	public void testGetString() {
        String name = s.getString();
        String nameExpected = "Test tube butt set.";
        assertEquals(name, nameExpected);
    }
	
	@Test
	public void testGetPalindrome() {
        boolean palind = s.getPalindrome();
        boolean palindExpected = true;
        assertEquals(palind, palindExpected);
    }
	
	@Test
	public void testGetVowel() {
        int v = s.getVowel();
        int vExpected = 5;
        assertEquals(v, vExpected);
    }

	@Test
	public void testGetConsonant() {
        int c = s.getConsonant();
        int cExpected = 10;
        assertEquals(c, cExpected);
    }
}
