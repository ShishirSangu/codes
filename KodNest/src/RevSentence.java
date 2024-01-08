import java.util.Scanner;

public class RevSentence {
	
	static String Rev(String str) {
		String arr[] = str.split(" ");
		String RevSentence = "";
		
		for(int i=0;i<=arr.length-1;i++) {
			String word = arr[i];
			String RevWord = "";
			
			for(int j=word.length()-1;j>=0;j--) {
				RevWord =  RevWord + word.charAt(j);
			}
			RevSentence = RevSentence + RevWord + " ";
		}
		
		return RevSentence;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String str = scan.nextLine();
		
		String inRev = RevSentence.Rev(str);
		
		System.out.println("In reverse : \n" + inRev);
		
	}

}
