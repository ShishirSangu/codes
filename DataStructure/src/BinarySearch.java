
public class BinarySearch {
	
	static int binarySearch(int arr[], int num) {
		int low = 0;
		int high = arr.length-1;
//		int index = 0;
		while(low<=high) {
			
			int mid = (high+low)/2;
			if(num ==  arr[mid]) {
				return mid;
			}else if(num < arr[mid]) {
				high = mid-1;
			}else if(num > arr[mid]) {
				low = mid+1;
			}
		}return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20, 30, 40, 80, 45, 64, 60, 70, 60, 48};
		int res = BinarySearch.binarySearch(arr, 40);
		System.out.println("This number in the array in " + res); 
	}

}
