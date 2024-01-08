
public class FactorialNumber {
	
//	input = 5
//	o/p = 120
	
	static int factorial(int num) {
		int fact = 0;
		if(num == 0) {
			return 1;
		}return num * factorial(num-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = FactorialNumber.factorial(5);
		System.out.println(res);
	}

}
