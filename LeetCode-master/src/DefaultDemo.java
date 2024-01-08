


public class DefaultDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.mee();
	}
}

class A{
	void me() {
		System.out.println("hai");
	}
}

class B extends A{
void mee() {
	System.out.println("meee");
}
}
