
public class FactorsNum {
	
	static int theNum(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}if(count == 2) return n;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<=100;i++) {
			int res = theNum(i);
			if(res!=-1) System.out.println(res);
		}

	}

}
