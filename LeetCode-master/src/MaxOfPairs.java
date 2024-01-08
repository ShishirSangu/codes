import java.util.HashSet;

public class MaxOfPairs {
	
	int maxNumOfPairs(String[] words) {
		int maxPairs = 0;
		HashSet<String> wordSet = new HashSet<>();
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String revWord = new StringBuilder(word).reverse().toString();
			if(wordSet.contains(revWord)) {
				maxPairs++;
				wordSet.remove(revWord);
			}else {
				wordSet.add(word);
			}
		}return maxPairs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cd", "ac", "dc", "ca", "zz"};
		MaxOfPairs solution = new MaxOfPairs();
        int maxPairs = solution.maxNumOfPairs(words);
        System.out.println("Maximum number of pairs: " + maxPairs);
	}

}
