
public class PerfectNum {
	
	static int theNum(int n) {
		int sum =0 ;
//		int fact = 1;
		for(int i=1;i<n;i++) {
			if(n%i==0) 
			sum += i;
		}if(sum == n) return n;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=1000;i++) {
			int res = theNum(i);
			if(res != 0) 
				System.out.println(res);
		}
	}

}
