
public class StringWordPractice {
	
	static void getWord(String s){
		s += " ";
		int end = 0;
		int position = 0;
		String word = "";
		
		String lword = "";
		int l = 0;
		
		while(s.indexOf(' ',position) > 0) {
			end = s.indexOf(' ',position);
			word = s.substring(position,end);
			if(word.length()>lword.length()) {
//				l = word.length();
				lword=word;
			}
			
			position = end + 1;
		}
		System.out.println(lword);
	}
	
	
	static void getword1(String s) {
		
//		s+=" ";
		String w = "";
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			if(c!=' ') {
				w = c+w;
				
			}else {
				System.out.println(w);
				System.out.println(w.length());
				w = ""; 
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is String";
		
//		getWord(s);
		
		getword1(s);

	}

}
