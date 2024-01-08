
public class SpecialNum {
	
	static int getNum(int num) {
		int temp = num;
		int sum =0 ;
		int prod = 1;
		while(num!=0) {
			int digit = num%10;
			sum += digit;
			prod = prod * digit;
			num = num/10;
		}
			if(sum+prod == temp) return temp;
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			int res = getNum(i);
			if(res != 0)
			System.out.println(res);
		}
	}

}
