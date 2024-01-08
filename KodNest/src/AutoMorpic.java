import java.util.Scanner;

public class AutoMorpic {

	static boolean check(int num) {
		
		int square = num * num;
		
		while(num!=0) {
			if(num%10!=square%10) {
				return false;
			}
			num = num/10;
			square = square/10;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
+
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a =  scan.nextInt();
		int b = scan.nextInt();
		
		for(int i=a;i<=b;i++) {
			boolean res = AutoMorpic.check(i);
			
			if(res == true) {
				System.out.println(i+ " ");
			}
		}
		
		
//		boolean res = AutoMorpic.check(num);
//		
//		if(res=true) {
//			System.out.println(num+" is a auto morpic number");
//			
//		}else {
//			System.out.println(num+ " it is not a automorpic number");
-++		}
		
		
	}

}
