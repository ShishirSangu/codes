import java.util.Scanner;
public class evenOrodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check that number is even or odd :");
		int n = scan.nextInt();
//		int b = scan.nextInt();
		if(n%2==0) {
			System.out.println(n+" is even number");
		}
		else {
			System.out.println(n+" is odd number");
		}
		}

}
