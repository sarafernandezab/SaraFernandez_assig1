
public class WordsChecker {

	public int VowelCounter(String s) {
	    int vow = 0;

	    String string = s.replaceAll(" ",""); 
	    string = string.toLowerCase();
	    for (int i = 0; i < string.length(); i++) {
	        char c = string.charAt(i);
	        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	            vow++;
	        }
	    }
	    return vow;
	}

	public int ConsonantCounter(String s) {
	    int cons = 0; 

	    String string = s.replaceAll(" ",""); 
	    string = string.toLowerCase();
	    for (int i = 0; i < string.length(); i++) {
	        char c = string.charAt(i);
	        if (!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) {
	            cons++;
	        }
	    }
	    return cons;
	}

	public boolean PalindromeChecker(String string) {
		return false;
	}

}
