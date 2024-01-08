
public class SqArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double arr[] = {2, 3, 5, 4, 6};
		double sq[] = new double[arr.length];
		double cr[] = new double[arr.length];
		for (int i=0;i<arr.length;i++) {
			sq[i] = Math.sqrt(arr[i]);
			cr[i] = Math.cbrt(arr[i]);
			System.out.println(sq[i]+"         "+cr[i]);
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(sq[i]+"         "+cr[i]);
		}
		

	}

}