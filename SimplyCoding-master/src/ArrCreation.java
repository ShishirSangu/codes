import java.util.Scanner;

public class ArrCreation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter length : ");
		int len = scan.nextInt();
		
		int arr[] = new int[len];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter an element : ");
			arr[i] = scan.nextInt(); 
		}
		System.out.println("Elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
//		int arr1[] = new int[arr.length];
//		for(int i=arr.length-1;i<arr.length;i--) {
//			arr1[i] = arr[i];
//		}
		System.out.println();
		System.out.println("Copy array are : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	}

}
