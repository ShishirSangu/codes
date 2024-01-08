import java.util.Scanner;

public class ReverseArr {
	
	static int[] rev(int arr1[]) {
		int arr2[] = new int[arr1.length];
		int j = arr1.length-1 ;
		
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[j] = arr1[i];
			j--;	
		}
		return arr2;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int len = scan.nextInt();
		int arr1[] = new int[len];
		
		
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println("Enter the index of " +i);
			arr1[i] = scan.nextInt();
		}
		
		int arr2[] = ReverseArr.rev(arr1);
		
		System.out.println("Enetr the elements : ");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Enter Reverse copy array : ");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
