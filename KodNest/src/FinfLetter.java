import java.util.Scanner;

public class FinfLetter {
	
	static boolean Search(String str,char key) {
		
		char arr[] = str.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		
		System.out.println("Enter the key : ");
		char key = scan.next().charAt(0);
		
		boolean item = FinfLetter.Search(str, key);
		
		if(item==true) {
			System.out.println("It is present : "+key);
		}
		else {
			System.out.println(key+" it is not present");
		}
		
	}

}
