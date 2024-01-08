import java.util.Scanner;

public class SelectionSort {
	
	void selection(int arr[], int len) {
		for(int i=0;i<len-1;i++) {
			int min = i;
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[min]) 
					min=j;
				}
					int temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = scan.nextInt();

        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = scan.nextInt();
        }

//        System.out.println("Displaying numbers: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println();

        SelectionSort s = new SelectionSort();
        s.selection(arr, len);

	}

}
