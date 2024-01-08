import java.util.Scanner;

public class perfectNumber {
	
	static int Perfect(int num) {
		
		int sum = 0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
			
		}return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		int res = perfectNumber.Perfect(num);
		
		if(num == res) {
			System.out.println(num+" is a perfect number");
		}else {
			System.out.println(num+" it is not a perfect number");
		}
		
		
	}

}
