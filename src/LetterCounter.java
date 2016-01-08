
public class LetterCounter {

	public int VowelCounter(String string) {
	    int vow = 0;

	    string = string.toLowerCase();
	    for (int i = 0; i < string.length(); i++) {
	        char c = string.charAt(i);
	        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	            vow++;
	        }
	    }
	    return vow;
	}

	public int ConsonantCounter(String string) {
	    int cons = 0; 

	    string = string.toLowerCase();
	    for (int i = 0; i < string.length(); i++) {
	        char c = string.charAt(i);
	        if (!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) {
	            cons++;
	        }
	    }
	    return cons;
	}

}
