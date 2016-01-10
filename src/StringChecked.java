
public class StringChecked {

	private String string;
	private boolean palind;
	private int vow;
	private int cons;

	public StringChecked() {	
	}

	public void setString(String string) {
		this.string = string;
	}
	public void setPalindrome(boolean palind) {
		this.palind = palind;		
	}
	public void setVowel(int i) {
		this.vow = i;	
	}
	public void setConsonant(int i) {
		this.cons = i;
	}

	public String getString() {
		return string;
	}

	public boolean getPalindrome() {
		return palind;
	}

	public int getVowel() {
		return vow;
	}

	public int getConsonant() {
		return cons;
	}
	
	public String toString(){
		String p;
		if(getPalindrome()) p="yes";
		else p="no";
		
		return ( "String: " + getString()
				+ "Palindrome: " + p 
				+ "Number of vowels: " + getVowel() 
				+ "Number of vowels: " + getConsonant());
		
	}

	public boolean ContainsSymbolsOrNumbers() {
		return false;
	}

}