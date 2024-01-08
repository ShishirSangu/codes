import java.util.Scanner;

public class BubbleSort {
    void bubbleSort(int arr[], int len) {
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Display the elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = scan.nextInt();

        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Displaying numbers: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr, len);
    }
}
