
public class SeriesPowTry {
	
	static double getNum(int n) {
		double sum = 0;
		for(int i=1,a=9;i<=n;i++,a+=4) {
			sum = sum + Math.pow(a, i);
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res = getNum(5);
		System.out.println(res);

	} 

}
