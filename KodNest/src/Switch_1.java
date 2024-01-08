import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number from 1-3");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Enter a choice : ");
		char choice = scan.next().charAt(0);
		
		switch(choice) {
		case '-':
			System.out.println(a-b);
			break;
		case '+':
			System.out.println(a+b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("Read the message properly");
		}

	}

}
