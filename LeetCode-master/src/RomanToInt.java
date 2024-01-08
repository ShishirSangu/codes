import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
	
	static int getInt(String s) {
		
		Map<Character, Integer> map = new HashMap<>() {{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}};
		
		char arr[] = s.toCharArray();
		int previous = 0;
		int result = 0;
		int n=s.length();
		int current = 0;
		
		for(int i=n-1;i>=0;i--) {
			current = map.get(arr[i]);
			if(previous > current) {
				result -= current;
			}else {
				result += current;
			}
			previous = current;
		}
//		System.out.println("The answer is : "+result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		String s = scan.next();
		
		int res = getInt(s);
		System.out.println(res);
//		getInt("III");
		
	}

}
