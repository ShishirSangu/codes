
public class OverLoad {
	// input a and b
	// o/p add = a+b
	//o/p add
	void add(int a , int b){
		System.out.println(a+b);
	}
	void sub extends add() {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad O =new OverLoad();
		O.add(2, 5);
		O.add(5.5, 6.6);
	}

}


