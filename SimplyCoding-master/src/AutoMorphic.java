
public class AutoMorphic {
	
	static int getNum(int n) {
		int t = n;
		int q = n*n;
		int flag = 0;
		while(n!=0) {
			int d = n%10; 
			int d1 = q%10;
			if(d != d1) {
				flag = 1;
				break;
			}
			n = n/10; 
			q=q/10;
		}
		if( flag == 0) 
			return t;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=24;i<1000;i++) {
		

			int res = getNum(i);
			if(res!=-1)
			System.out.println(res);
			
		}
	}

}
