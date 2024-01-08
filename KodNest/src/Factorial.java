import java.util.Scanner;

public class Factorial {
	
	static int Fact(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact=i*fact;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial of a number ");
		int num = scan.nextInt();
		
		int res = Factorial.Fact(num);
		System.out.println(res);
		
	}

}
