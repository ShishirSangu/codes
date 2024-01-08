
public class Occurence {
	
	static void fingAswer(String s, String t) {
		int idx = 0;
		
		for(int i=0;i<t.length();i++) {
			if(s.charAt(i) == t.charAt(idx)) {
				idx++;
			}else {
				System.out.println("Input is wrong");
			}
		}
		System.out.println("Right input");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sadness";
		String t = "sad";
 		
		
		fingAswer(s, t);

	}

}
