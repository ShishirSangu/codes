
public class Methods {
	
	void findSquare1() {
		int num = 4;
		int Sq = num*num;
		System.out.println("Square : "+Sq);
	}
	
	void findSquare2(int n) {
		
		int sq = n*n;
		System.out.println("Square : "+sq);
	}
	
	int findSquare3(int num) {
		int sq = num*num;
		return sq;
	}
	
	int findSquare4() {
		int n = 8;
		int sq = n*n;
		return sq;
	}
	
	static int findSquare5() {
		int n = 9;
		int sq = n*n;
		return sq;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// No argument and no return type
		Methods M1 = new Methods();
		M1.findSquare1();
		System.out.println();
		
		// anonymous object
		new Methods().findSquare1();
		System.out.println();
		
		//argument with no return type
		new Methods().findSquare2(5);
		System.out.println();
		
		// have argument and give return type
		int res = new Methods().findSquare3(6);
		System.out.println("Square : " + res);
		System.out.println();
		
		//no argument but have return type
		Methods M4 = new Methods();
		int res1 = M4.findSquare4();
		System.out.println("Square : "+res1);
		
		//By using static method to call object 
		int res3 = findSquare5();
		System.out.println("Square : "+res3);
	}

}
