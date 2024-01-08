
public class SpyNum {
	
	static boolean spynum(int num) {
		int temp = num;
		int sum = 0;
		int prod = 1;
		int digit = 0;
		while(num != 0) {
			digit = num%10;
			sum = sum + digit;
			prod = prod * digit;
			num = num / 10;
		}
		 if(sum == prod)
			 return true;
		 else
			 return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=100;i<150;i++) {
			boolean res = spynum(123);
			System.out.println(res+" These are spy numbers");
//		}

	}

}
