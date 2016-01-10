import java.util.Arrays;
import java.util.List;


public class WordsChecker {
	//symbols or spaces are not taken into account in this checker

	public int VowelCounter(String s) {
		if (s == null) {
		    throw new IllegalArgumentException("Input cannot be null.");
		}
		else{
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
	}

	public int ConsonantCounter(String s) {
		if (s == null) {
		    throw new IllegalArgumentException("Input cannot be null.");
		}
		int cons = 0; 
	    String string = s.replaceAll(" ",""); 
	    string = string.toLowerCase();
	    List<Character> consonants = Arrays.asList( 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z');
	    for (int i = 0; i < string.length(); i++) {
	        if (consonants.contains(string.charAt(i))) {
	            cons++;
	        }
	    }
	    return cons;
	}

	public boolean PalindromeChecker(String s) {
		if (s == null) {
		    throw new IllegalArgumentException("Input cannot be null.");
		}
	    String palindromo = s.replaceAll(" ","");    
	    palindromo = palindromo.replaceAll("[^A-Za-z]", "").toLowerCase();
	    int longitud = palindromo.length();
		for(int i=0; i<longitud/2; i++){
				if(palindromo.charAt(i)==palindromo.charAt(longitud-1-i));
				else
					return false;
		}
		return true;
	}
}

