
public class DecimalToBinary {
	
	static void getBin(int decimal) {
		int binary[] = new int[10];
		int index = 0;
		
		while(decimal > 0) {
			binary[index++] = decimal%2;
			decimal = decimal/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int decimal = 10;
		getBin(decimal);
		
	}

}
