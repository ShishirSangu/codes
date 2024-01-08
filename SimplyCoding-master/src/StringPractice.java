
public class StringPractice {
	
	static void getVowel(String s) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);

			c = Character.toUpperCase(c);
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
				count++;	
			}
		}System.out.println(count);
	}
	
	static void getAorB(String s) {
		int Acount = 0;
		int Bcount = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);

			c = Character.toUpperCase(c);
			if(c=='A'){
				Acount++;	
			}else if(c=='B') {
				Bcount++;
			}
		}
		System.out.println("A count : "+Acount);
		System.out.println("B count : "+Bcount);
	}
	
	static void getLOwtoUpper(String s) {
		String ns = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);

//			c = Character.toUpperCase(c);
			if(Character.isUpperCase(c)){
				ns += Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				ns += Character.toUpperCase(c);
			}else {
				ns += c;
			}
		}
		System.out.println(ns);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hai Baby How Are You";
		
		getVowel(s);
		
		getAorB(s);
		
		getLOwtoUpper(s);

	}

}
