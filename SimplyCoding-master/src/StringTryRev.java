
public class StringTryRev {
	
	static void getWord(String s) {
		String rev = "";
//		s=" ";
		String w = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			rev = c + rev;
//			w="";
		}System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This a string";
		 
		getWord(s);
	}

}
