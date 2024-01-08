
public class interview {
	
//	void sumOf3(int num) {
//		int sum =0 ;
//		int d=0;
//		int a=0;
//		while(num!=0) {
//			d=num%10;
//			for(int i=0;i<3;i++) {
//				if(i%2==0) {
//					a = d;
//				}else {
//					sum = sum+d;
//				}
//			}num = num/10;
//		}
//		if(a == sum) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 1000; i++) {
            int digit1 = i / 100;    
            int digit2 = i / 10;
            	digit2 = digit2%10;
            int digit3 = i % 10;   
            
            int evenSum = digit1 + digit3;  
            int oddSum = digit2;    
            
            if (evenSum == oddSum) {
                System.out.println(i);
            }
        }
//		int num = 110;
//		interview n = new interview();
//		n.sumOf3(num);
	}

}
