//import javax.xml.transform.Result;

public class AddOne {

	static int[] getNum(int[] d) {
		int n = d.length;
		for(int i=n-1;i>=0;i--) {
			d[i] += 1;
			if(d[i]<10) {
				return d;
			}
			d[i] = 0;
		}
		
		int[] result = new int[n+1];
		result[0] = 1;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {1,2,3};
		int[] r = getNum(d);
		for(int i=0;i<r.length;i++) {
			System.out.print(r[i]+" ");
//			if(i<r.length-1) {
//				System.out.print(" ");
//			}
		}
//		for(int i:r) {
//			System.out.print(i+" ");
//		}
	}

}
