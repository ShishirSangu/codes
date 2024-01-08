public class RevString2 {
	
	static void getRevString(String s) {
		char arr[] = s.toCharArray(); // Use char array instead of String array
		for(int i = 0; i < s.length(); i++) {
			char c = arr[i];
			String rev = "";
			for(int j = s.length() - 1; j >= 0; j--) { // Iterate in reverse order
				char ch = s.charAt(j);
				rev += ch; // Append the character to the reversed string
			}
			System.out.println(rev);
		}
	}
	
	public static void main(String[] args) {
		String s = "Shishir";
		getRevString(s);
	}
}
