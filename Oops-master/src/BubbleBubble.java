
public class BubbleBubble {
//	input = 50,20,30,10
//	o/p = 50,30,20,10
	
	void bubble(int arr[], int n) {
		for(int k=0;k<n-1;k++) {
			for(int h=0;h<n-1-k;h++) {
				if(arr[h] > arr[h+1]) {
					int temp=arr[h];
					arr[h]= arr[h+1];
					arr[h+1] = temp;
				}
			}
		}for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {80,50,10,30,40};
		BubbleBubble B = new BubbleBubble();
		B.bubble(arr, 5);
	}

}
