
public class SumNoLF {

	static boolean sumOf(int i) {
//		for(int i=100;i<1000;i++) {
			int digit1 = i/100;
			int digit2 = (i/10)%10;
			int digit3 = i%10;
			
			int sum = digit1 + digit3;
			return sum == digit2;
//		}
	}
	
	public static void main(String[] args) {
	
	for(int i=100;i<1000;i++) {
		if(sumOf(i)) {
			System.out.print(i+" ");
		}
	}

}}
