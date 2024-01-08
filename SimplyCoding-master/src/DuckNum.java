
public class DuckNum {

	static int getNum(int n) {
		int t = n;
		int d = 0;
		int count =0 ;
		while(n!=0) {
			d=n%10;
			if(d==0)
			count++;
			n=n/10;
		}if(count!=0) return t;
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=405;i<450;i++) {
			int res = getNum(i);
			if(res!=-1) 
				System.out.println(res);
		}
	}

}
