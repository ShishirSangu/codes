import java.util.Scanner;

public class MergeSort {
    void mergeSort(int[] arr, int start, int end) {
        if (start == end)
            return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    void merge(int[] arr, int start, int mid, int end) {
        int[] arrLeft = new int[mid - start + 1];
        int[] arrRight = new int[end - mid];

        for (int i = 0; i < arrLeft.length; i++) {
            arrLeft[i] = arr[start + i];
        }

        for (int j = 0; j < arrRight.length; j++) {
            arrRight[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < arrLeft.length && j < arrRight.length) {
            if (arrLeft[i] <= arrRight[j])
                arr[k++] = arrLeft[i++];
            else
                arr[k++] = arrRight[j++];
        }

        while (i < arrLeft.length)
            arr[k++] = arrLeft[i++];

        while (j < arrRight.length)
            arr[k++] = arrRight[j++];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = scan.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, 0, len - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

