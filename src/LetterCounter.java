
public class LetterCounter {

	public int VocalCounter(String string) {
	    int count = 0; // start the count at zero
	    // change the string to lowercase
	    string = string.toLowerCase();
	  
	    for (int i = 0; i < string.length(); i++) {
	        char c = string.charAt(i);
	        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	            count++;
	        }
	    }
	    return count;
	}

}
