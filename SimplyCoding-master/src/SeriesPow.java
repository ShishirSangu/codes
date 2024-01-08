
public class SeriesPow {
	
	static double power(double base, double pow ) {
		double power = 1;
		for(int i=1;i<=pow;i++) {
			power = power * base;
			
		}return power;
	}
	
	static double getNum(double n) {
		double sum =0 ;
		for(int i=1,p=1;i<=n;i++,p++) {
//			SeriesPow a = new SeriesPow();
			sum = sum + power(n,p);
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SeriesPow a = new SeriesPow();
		double res = getNum(5);
		System.out.println(res);
		
		double r = power(3,3);
		System.out.println(r);
		

	}

}
