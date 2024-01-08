
public class HarshadhNum {
	
	static int getNum(int num) {
		int sum = 0;
		int digit = 0;
		int temp=num;
		while(num!=0) {
			digit = num%10;
			sum += digit;
			num = num/10;
		}if(temp%sum==0) return temp;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=100;i<200;i++) {
			int res = getNum(i);
			if(res != -1)
			System.out.println(res);
		}
		
	}

}
