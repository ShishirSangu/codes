
public class FactorsProgram {
	
	void factors(int num) {
//		int count = 0;
//		int fact =0 ;
		int sum =0 ;
		for(int i=1;i<num;i++) {
			if(num%i==0)
//				System.out.println(i);
//				count++;
//				System.out.print(count+" ");
//				fact =i;
				sum += i;
		}
		if(sum == num) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FactorsProgram P = new FactorsProgram();
		P.factors(6);
		
	}

}
