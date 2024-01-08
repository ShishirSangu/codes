
public class StaticKeyword {
	static int count = 0;
	
	StaticKeyword(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword c1 = new StaticKeyword();
		StaticKeyword c2 = new StaticKeyword();
		StaticKeyword c3 = new StaticKeyword();
	}

}
