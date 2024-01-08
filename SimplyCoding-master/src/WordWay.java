
public class WordWay {
	
	static void getWord(String s) {
		s +=" ";
		String w = "";
		String ns = "";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				w += c;
			
			}
			else {
				System.out.println(w);
				w="";
			}
//			System.out.println(w);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a word";
		
		getWord(s);
	}

}
