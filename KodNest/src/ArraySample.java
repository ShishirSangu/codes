import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length : ");
		
		int len = scan.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the index "+i);
			arr[i]= scan.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("==================================");
		System.out.println("Enter the size of an arr : ");
		int len1=scan.nextInt();
		float arr1[] = new float[len1];
		
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println("Enter the array index : " + i);
			arr1[i]=scan.nextFloat();
		}
		System.out.println("Array elemets are : ");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println();
		System.out.println("===============================");
		System.out.println("Enter the size of the array : ");
		int len2 = scan.nextInt();
		String arr2[]=new String[len2];
		
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.println("Enter the element to array index  : ");
			arr2[i] = scan.next();		
			}
		System.out.println("Array strings are : ");
		{
			for(int i=0;i<=arr2.length-1;i++) {
				System.out.print(arr2[i]+" ");
			}
		}
	}

}
