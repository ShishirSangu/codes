import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Given string s(abcabsbb) , how many character are present in that string  

public class FindString {

	
	void longest_string(String str) {
		char[] s = str.toCharArray();
		System.out.println(s);
		
//		List<Character> a = new ArrayList<Character>();
		
		HashMap<Character,Integer> strMap = new HashMap<>();
		for(char x:s) {
			System.out.println(x);
			boolean isPrese = strMap.containsKey(x);
			 if(isPrese == false) {
				strMap.put(x, 1);
			 }
		}
		
		int uniqueCharacyter = strMap.keySet().size();
		System.out.println("the presented character are : "+uniqueCharacyter);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcabcbb";
//		int longest = 0;
		
		FindString f = new FindString();
		f.longest_string(input);
		
//		System.out.println(longest);
	}

}
