
public class KrishnaMurthi {
	
	static int getNum(int n) {
		int sum = 0;
		int temp = n;
		int d =0 ;
		int count = 0;
		while(n!=0) {
			d=n%10;
			int fact = 1;
			for(int i=1;i<=d;i++) {
				fact = fact * i;
				
			}sum += fact; 
			n = n/10;
		}
		if(sum == temp) return temp;
//		return count++;
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=100;i<200;i++) {
			int res = getNum(i);
			if(res!=-1) System.out.print(i+" ");
		}
	}

}
