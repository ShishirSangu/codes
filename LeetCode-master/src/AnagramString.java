import java.util.Arrays;

public class AnagramString {
	
	static void isAnagram(String s, String t) {
		
		if(s.length()!=t.length())
			System.out.println("Is not an anagram");
		
		char a[] = s.toCharArray();
		char b[] = t.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean res = Arrays.equals(a, b);
		
		if(res == true)
			System.out.println("Is anagram");
		else
			System.out.println("Is not an anagram");
	}
	
	static boolean isAnagramm(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ARADHYA";
		String t = "HRADAYA";
		
		isAnagram(s,t);
		
		boolean df = isAnagramm(s,t);
		if(df == true)
			System.out.println("Is anagram");
		else
			System.out.println("Is not an anagram");
		
	}

}
