import java.util.Scanner;

public class SumDigit {
	
	int findSum(int num) {
	int digit=0;
	int sum=0;
	
	while(num!=0) {
		digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		SumDigit S=new SumDigit();
		int res = S.findSum(num);
		System.out.println("SumDigit is : "+res);
		
		
	}

}
