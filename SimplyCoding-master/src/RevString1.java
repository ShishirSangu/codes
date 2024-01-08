
public class RevString1 {
	
	static String getRevString(String s) {
		char c[] = s.toCharArray();
		int len = c.length;
		char rev[] = new char[len];
		int j = len-1;
		for (int i=0;i<len;i++) {
			rev[j] = c[i];
			j--;
		}
		String reverseString = new String(rev);
		return reverseString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Shishir";
		String res = getRevString(s);
		System.out.println("Reverse String is : "+res);

	}

}
