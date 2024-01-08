import java.util.Arrays;

public class Use {
	
	int[] something() {
		int a[] = {1,2,3};
//		System.out.println(a);
		
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Use s = new Use();
		s.something();
		
		int[] t = s.something();
		System.out.println(Arrays.toString(t));
		
	}

}
