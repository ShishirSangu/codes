import java.util.HashSet;

public class FindStr {
    // input = "abcabcbb"
    // o/p = 3

    int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxLength = 0;

        for (int i = 0; i < len; i++) {
            HashSet visited = new HashSet();
            int length = 0;

            for (int j = i; j < len; j++) {
                char currentChar = s.charAt(j);

                if (visited.contains(s)) {
                    break;
                }

                visited.add(s);
                length++;
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        FindStr findStr = new FindStr();
        int result = findStr.lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
