public class QuickSort {

    void quickSort(int arr[], int lo, int hi) {
        if (lo < hi) {
            int pivotpos = partition(arr, lo, hi);
            quickSort(arr, lo, pivotpos - 1);
            quickSort(arr, pivotpos + 1, hi);
        }
    }

    int partition(int arr[], int lo, int hi) {
        int pivot = arr[hi];
        int i = lo - 1;

        for (int j = lo; j < hi; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, hi);
        return i + 1;
    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 80, 45, 64, 60, 70, 60, 48};
        QuickSort q = new QuickSort();

        q.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
