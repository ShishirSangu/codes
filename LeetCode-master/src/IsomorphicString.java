
public class IsomorphicString {
	
	static void isIsomophic(String s , String t) {
		
		if(s.length()!=t.length()) {
			System.out.println("Not Isomorphic");
		}
		
		int map1[] = new int[256];
		int map2[] = new int[256];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != t.charAt(i))
				System.out.println("Not Isomorphic");
			System.out.print((s.charAt(i)) + " " +(t.charAt(i)));
//			System.out.println();
//			System.out.print(t.charAt(i));
			map1[s.charAt(i)] = i+1;
			map2[t.charAt(i)] = i+i;
			System.out.println();
		}
		System.out.println("Yes is Isomorphic");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "titel";
		String t = "paper";
		
		isIsomophic(s,t);
	}
}
