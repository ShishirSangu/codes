
public class MaxAndMin {
	
	static void arrAre(int arr[]) {
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) max = arr[i];
			if(arr[i]<min) min = arr[i];
		}System.out.println("Max = "+max +" "+"\nMin = "+ min);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		arrAre(arr);
	}

}
