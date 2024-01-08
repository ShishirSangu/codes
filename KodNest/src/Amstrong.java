import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		
		int power=Amstrong.getCount(num);
		
		int res=Amstrong.getSum(num, power);
//		System.out.println("Enter the result : "+res);
//		
		if(res==num) {
			System.out.println("Enter the number is armstrong "+num);
		}
		else {
			System.out.println("Entered number is not a armstrong "+num);
		}
		
		
		

	}
	static int getCount(int num) {
		int count=0;
		while(num!=0) {
			int digit=num%10;
			count++;
			num=num/10;
			   
		}
		return count;
		
	}
	static int getSum(int num,int power) {
		int sum=0;
		if(num==0) {
			return 0;
		}
		while(num!=0) {
			int digit1=num%10;
			int value=(int)Math.pow(digit1,power);
			sum=sum+value;
			num=num/10;
		}
		return sum;
	}

}
