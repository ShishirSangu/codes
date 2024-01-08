import java.util.Scanner;

public class AbundantNo {
	
	static boolean detectAbundantNo(int num) {
		
		int sum = 0;
		int digit = 0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				
				sum = sum+i;
				
			}
		}if(sum>num) {
				return true;
				
			}else {
				return false;
			}
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		boolean res = AbundantNo.detectAbundantNo(num);
		
		if(res==true) {
		System.out.println(num+" is a Abundant number");

	}else {
		System.out.println(num+" is a deceident nuber");
	}

}
}
