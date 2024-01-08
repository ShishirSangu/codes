import java.util.Scanner;

public class BubbleSort {
	
//	void bubble(int []arr, int len) {
//		for(int i=0;i<len-1;i++) {
//			for(int j=0;j<len-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					
//				}
//				
//			}
//		}
//		System.out.println("Enter the sorted array : ");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
	
	
//	void Selection(int []arr, int len) {
//		for(int i=0;i<len-1;i++) {
//			int min = i;
//			for(int j=i+1;j<len;j++) {
//				if(arr[j]<arr[min]) 
//				min = j;
//				{
//					int temp = arr[min];
//					arr[min] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//		System.out.println("Enter the sorted array : ");
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
	
	
	 

	
	void insertion(int []arr, int len) {
		for(int i=0;i<len;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		System.out.println("Dsplay sorted arr : ");
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

	
	
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int len = scan.nextInt();
		
//		System.out.println("Enter the element to the array : ");
		int arr[] = new int[len];
		
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter the element to the array " + i+ ": ");
			arr[i] = scan.nextInt();
		}
		System.out.println("Dislay number : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
		BubbleSort B = new BubbleSort();
		B.insertion(arr, len);
		
//		 System.out.println("Sorted array:");
//	        for (int i = 0; i < arr.length; i++) {
//	            System.out.print(arr[i] + " ");
//	        }
	}

}
