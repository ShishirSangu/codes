
public class BubbleSort1 {
	
	void BubbleSort(int arr[], int len) {
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50, 60 ,40 ,10 ,45};
		int len = 5;
		
		BubbleSort1 B = new BubbleSort1();
		B.BubbleSort(arr, len);
	}

}
