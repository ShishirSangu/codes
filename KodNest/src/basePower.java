import java.util.Scanner;

public class basePower {
	static int power(int base,int exp) {
		int power =1;
		for(int i=1;i<=exp;i++) {
			power = power*base;
		}
		return power;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base and Exponential number : ");
		int base=scan.nextInt();
		int exp=scan.nextInt();
		int res1=(int)Math.pow(base,exp);
//		double res1=Math.pow(base,exp);
		System.out.println("Answer is : "+res1);
		
//		basePower P=new basePower();
		int res=basePower.power(base, exp);
		System.out.println("Answer is : "+res);
		
	}
//	int power(int base,int exp) {
//		int power =1;
//		for(int i=1;i<=exp;i++) {
//			power = power*base;
//		}
//		return power;
//	}
//	return power;

}
