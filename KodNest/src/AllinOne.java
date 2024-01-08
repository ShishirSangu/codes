import java.util.Scanner;

public class AllinOne {
	 int count(int num) {
		 int count = 0;
		 while(num!=0) {
			 int digit = num%10;
			 count++;
			 num = num/10;
		 }return count;
	 }
	static int sum(int num, int power) {
		int digit = 0;
		int sum =0;
		
		while(num!=0) {
			digit = num%10;
			int value = (int)Math.pow(digit, power);
			sum = sum + value;
			num = num/10;
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num =  scan.nextInt();
		AllinOne A=new AllinOne();
		int power = A.count(num);
		
		int res = A.sum(num, power);
		
		if(res==num) {
			System.out.println(num+" Number is ArmStrong "+res);
		}else {
			System.out.println(num+" Number is not a ArmStrong "+res);
		}
		
}
}
