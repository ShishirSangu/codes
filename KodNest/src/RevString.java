import java.util.Scanner;

public class RevString {
	static String rev(String str) {
		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length];
		int j = arr2.length-1;
		
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[j] = arr1[i];
			j--;
		}
		str = new String(arr2);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();
		
		String res = RevString.rev(str);
		
		System.out.println("Original String : "+str);
		System.out.println("Reverse String : "+res);
	}

}
