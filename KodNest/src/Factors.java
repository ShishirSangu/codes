import java.util.Scanner;

public class Factors {
	void factor(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check its factors");
		int num=scan.nextInt();
		
		Factors F=new Factors();
		
		F.factor(num);
//		System.out.println(res);
	}

}
