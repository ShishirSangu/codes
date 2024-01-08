
public class StarPatter22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<n;i++) {
			char p = 'A';
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<n;j++) {
				System.out.print(" "+p++);
			}
			System.out.println();
		}
	}
}
