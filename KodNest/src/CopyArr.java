import java.util.Scanner;

public class CopyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int len = scan.nextInt();
		int arr[] = new int[len];
		
		
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the index of arr : ");
			arr[i] = scan.nextInt();	
//			System.out.println(arr[i]+" ");
		}
		System.out.println("Display the number : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int arr2[]= new int[arr.length];
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i] = arr[i];
		}
		System.out.println("Enter the copy number : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr2[i]+" ");
			
		}
	}

}
