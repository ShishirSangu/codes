import java.util.Scanner;

public class NumberProgram {
	void Num(int num) {
		
		int digit = 0;
		int m = num;
		int sum = 0;
//		int pro = 1;
		while(num!=0) {
			digit = num%10;
			sum = sum + digit;
//			pro = pro * digit;
			num = num/10;
		}
		if(sum*sum == m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		
		NumberProgram n = new NumberProgram();
		n.Num(num);
	}

}
