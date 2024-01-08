import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
//		int num = scan.nextInt();
		for (int num=100;num<150;num++) {
//		Palindrome p = new Palindrome();
			if(MainMethod.revNum(num)) {
				System.out.println(num+" Is palindrome number");
			}
//		p.revNum(num);
//		System.out.println(res);
		}
	}

}
