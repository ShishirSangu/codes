
public class RevOfString {
	
	static void stringEx(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
//		char arr[] = new char[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shishir sangu";
		char arr[] = s.toCharArray();
		stringEx(arr);
	}
}
