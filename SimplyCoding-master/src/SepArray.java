
public class SepArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = {2.01102, 3.0012, 4.50400, 6.5111, 5.5455};
		double w[] = new double[arr.length];
		double f[] = new double[arr.length];
		for(int i=0;i<arr.length;i++) {
			w[i] = (long)arr[i];
			f[i] = arr[i] - w[i];
			System.out.println("w : "+w[i]+"  f : "+f[i]);
		}
		

	}

}
