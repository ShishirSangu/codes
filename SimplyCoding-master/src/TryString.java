
public class TryString {
	
	static void getWord(String s) {
		String sn = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
//			if(Character.isUpperCase(c))
			sn=c+sn;
		}
		System.out.println(sn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is String";
		
		getWord(s);
	}

}
