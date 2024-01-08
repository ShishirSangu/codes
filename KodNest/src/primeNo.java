import java.util.Scanner;
public class primeNo {
	boolean isPrime(int n) {
		if(n==1 || n==0) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scan.nextInt();
		primeNo P = new primeNo();
		boolean res = P.isPrime(a);
		if(res==true) {
			System.out.println(a+" is a prime number");
		}
		else {
			System.out.println(a+" is not a prime number");
		}
		

	}

}
