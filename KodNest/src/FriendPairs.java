import java.util.Scanner;

public class FriendPairs {
	
	static int FindSum(int num) {
		int sum = 0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sum1 = FriendPairs.FindSum(num1);
		int sum2 = FriendPairs.FindSum(num2);
		
		int res1 = sum1/num1;
		int res2 = sum2/num2;
		
		if(res1==res2) {
			System.out.println(num1+" and "+num2+" they are friendly pairs");
		}else {
			System.out.println(num1+" and "+num2+" they are not friendly pairs");
		}

	}

}
