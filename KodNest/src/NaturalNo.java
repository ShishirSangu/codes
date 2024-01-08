import java.util.Scanner;
public class NaturalNo {
	
	int sum(int a,int b) {
		
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
//		System.out.println("sum of that natural number is " +sum);
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=scan.nextInt();
		int b=scan.nextInt();
		NaturalNo natural_number = new NaturalNo();
		
		int sum=natural_number.sum(a,b);
		System.out.println("sum of that natural number is " +sum);
		scan.close();

	}

}
