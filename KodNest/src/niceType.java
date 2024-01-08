
public class niceType {
	
	void add() {
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	
	void sub(int a,int b) {
		int c= a-b;
		System.out.println(c);
	}
	
	int mul(int a, int b) {
		int c=a*b;
//		System.out.println(c);
		return c;
	}
	
	int div() {
	int	a=10;
	int	b=5;
	int c=a/b;
	return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		niceType n = new niceType();
		n.add();
		
		n.sub(8,2);
		
//		n.mul(2, 3);
		int res = n.mul(2, 4);
		System.out.println(res);
		
		int res1 = n.div();
		System.out.println(res1);
	}

}
