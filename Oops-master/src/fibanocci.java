
public class fibanocci {
	
	// input = 5
	// o/p = 0,1,1,2,3
	void fib(int num) {
		int num1 = 0;
		int num2 = 1;
		
		if(num == 0) {
			System.out.println(num1);
		}else if(num == 1) {
			System.out.println(num1+" "+num2);
		}else {
			System.out.print(num1+" "+num2+" ");
			int x = 0;
			for(int i=2;i<num;i++) {
				x = num1+num2;
				System.out.print(x+" ");
				num1 = num2;
				num2 = x;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibanocci f = new fibanocci();
		f.fib(5);
	}

}
