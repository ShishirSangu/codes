import java.util.Scanner;

public class strongNumber {
	
	int strong(int nu) {
		int fact = 1;
		for(int i=1;i<=nu;i++) {
			fact = fact*i;
		}
		return fact;
	}
	boolean StrongNumber(int numbe) {
		int temp = numbe;
		int digit = 0;
		int sum = 0;
		while(temp!=0) {
			digit = temp%10;
			sum = sum + strong(digit);
			temp = temp/10;
		}
		if(sum == numbe) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		
		strongNumber F = new strongNumber();
		boolean res = F.StrongNumber(num);
		if(res==true) {
			System.out.println(num+" is a strong number");
		}else {
			System.out.println(num+" is not a strong number");
		}

	}

}
