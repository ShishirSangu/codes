import java.util.Scanner;

public class reverseNo {
	
	int reverse(int num) {
		int digit=0;
		int rev=0;
		
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		reverseNo R= new reverseNo();
		int res = R.reverse(num);
//		System.out.println("Reverse of that number is : "+res);
		if(res==num) {
			System.out.println(res+" it is a palindrom number");
		}
		else {
			System.out.println(res+" it is not a palindrom number"); 
		}
	}

}
