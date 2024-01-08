
public class Palindrome {

	static boolean revNum(int num) {
		int temp = num;
		int sum =0;
		int digit = 0;
		while(num > 0) {
			digit = num%10;
			sum = sum*10+digit;
			num = num/10;
		}
		return temp == sum;
	}
	
//	void revNumber() {
//		for(int i=100;i<150;i++) {
//			int sum=0;
//			int digit = 0;
////			int temp = num;
//			int i = 0;
//		}
//		
//	}

}
