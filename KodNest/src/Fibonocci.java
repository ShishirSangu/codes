import java.util.Scanner;

public class Fibonocci {
	
	void fibonocci(int num) {
		int num1 = 0;
		int num2 = 1;
		if(num==1) {
			System.out.println(num1);
		}
		else if(num == 2){
			System.out.print(num1+" "+num2);
		}
		else {
			System.out.print(num1+" "+num2+" ");
			
//			int fib = 0; wrong mistake
			for(int i=3;i<=num;i++) {
				int fib = num1+num2;
				System.out.print(fib+" ");
				num1 = num2;
				num2 = fib;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		
		Fibonocci F=new Fibonocci();
		F.fibonocci(num);
		scan.close();
		

	}

}
