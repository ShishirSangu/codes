
public class PalindromeString {
	
	static boolean getRes(String s) {
		if(s.isEmpty()) {
			return true;
		}
		int start = 0;
		int last = s.length()-1;
		
		while(start<=last) {
			char curtFirst = s.charAt(start);
			char curtLast = s.charAt(last);
			if(!Character.isLetterOrDigit(curtFirst)) {
				start++;
			}else if(!Character.isLetterOrDigit(curtLast)) {
				last--;
			}else {
				if(Character.toLowerCase(curtFirst) != Character.toLowerCase(curtLast)) {
					return false;
				}
				start++;
				last--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "A man, a plan, a canal: Panama";
		
		boolean res = getRes(s);
		
		if(res == true)
			System.out.println("Is palindrome");
		else
			System.out.println("Is not a palindrome");

	}

}
