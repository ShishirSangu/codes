
public class TryString1 {
	
	static void getWord(String s) {
		String sn = "";
		String pl = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			char u = Character.toUpperCase(c);
			if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U') {
				if(i==0)
					pl = s + "WAY";
				else 
					pl = s.substring(i) + s.substring(0,i) + "AY";
				break;
			}
		}
		System.out.println(pl);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "This is String";
		String s = "CLEAR";
		
		getWord(s);
	}

}

