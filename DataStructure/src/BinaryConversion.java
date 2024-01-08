
public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int binary = 1010;
		
		int d=0;
		int n=0;
		while(true) {
			if(binary==0) {
				break;
			}else {
				int temp = binary%10;
				d =  d + (int)(temp*Math.pow(2, n));
				binary = binary/10;
				n++;
			}
		}
		System.out.println(d);
	}
}
