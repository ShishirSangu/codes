
public class ForMyUse {
	
	void strItem(String s) {
		String w = "";
		s = s+" ";
		String lw = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				w += c;
			}else {
				if(w.length()>lw.length()) {
					lw = w;
				}
				w = "";
			}
		}System.out.println(lw);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForMyUse u = new ForMyUse();
		String str = "A RED SPEED";
		u.strItem(str);
	}

}
