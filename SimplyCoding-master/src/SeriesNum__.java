
public class SeriesNum__ {
	
	static int power(int base,int pow ) {
		int power = 1;
		for(int i=0;i<=pow;i++) {
			power = base * power;
		}return power;
	}
	
	static int theSum(int n) {
		int sum = 0 ;
		for (int i=1,b=9,p=1;b<n;i++,b+=4,p++) {
			sum = sum + power(b,p);
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = theSum(20);
		System.out.println(res);
	}

}
