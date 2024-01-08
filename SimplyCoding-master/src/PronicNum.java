
public class PronicNum {
	
	static int theNum(int n) {
		int t = n;
		int fact =0;
		for (int i=0;i<=n;i++) {
			if(i*(i+1)==n) { fact = n;
			System.out.println(i);}
		}if(fact  == t) return t;
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=100;i++) {
			int res = theNum(i);
			if(res != -1) 
				System.out.println(res);
		}

	}

}
