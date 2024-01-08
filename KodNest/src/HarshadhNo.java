import java.util.Scanner;

public class HarshadhNo {
	
	static boolean detectHarshadNum(int num) {
		
		int original = num;
		int sum = 0;
		int digit = 0;
		
		while(num!=0) {
			digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		if(original%sum==0) {
			System.out.println(original+" is completetly divided by "+sum+" so ");
			return true;
			
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		boolean res = HarshadhNo.detectHarshadNum(num);
		
		if(res==true) {
			System.out.println(num+" is harshadh number");
		}else {
			System.out.println(num+" is a deciedent number");
		}
	}

}
