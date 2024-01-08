import java.util.Scanner;

public class RevrseStringWithSpace {
	static String rev(String str) {
		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length];
		
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]==' ') {
				arr2[i] = arr1[i];
			}
//			retrun arr2;
		}
		int j = arr2.length-1;
		
		for(int i=0;i<=arr1.length-1;i++) {
			
			if(arr1[i]!=' ') {
				if(arr2[j]==' ') {
					j--;
				}
				arr2[j]=arr1[i];
				j--;
			}
		}
		str = new String(arr2);
		return str;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentance : ");
		String str = scan.nextLine();
		
		String res = RevrseStringWithSpace.rev(str);
		System.out.println("Original sentence : "+str);
		System.out.println("Reverse sentence : "+res);

	}

}
