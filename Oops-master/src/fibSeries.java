
public class fibSeries {
	
	// num=6
	// o/p = 0,1,1,2,3,5
	
	
	void fib(int num) {
//		int fib = 0;
		int num1 = 0;
		int num2 = 1;
		
		if(num==0) {
			System.out.println(num1);
		}else if(num==1){
			System.out.println(num1+" "+num2);
		}else {
//			System.out.println(num1+" "+num2+" ");
			int fib1 = 0;
			String series = "0,1,";
			for(int i=2;i<num;i++) {
				fib1 = num1+num2;
				num1 = num2;
				num2 = fib1;
				series += fib1+" ";
//				System.out.println();
			}System.out.println(series);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibSeries f = new fibSeries();
		f.fib(6);
	}

}
