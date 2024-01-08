
public class MergeDiffArray {
	
	static void getTheArrays(int arr[]) {
		int ea = 0;
		int oa = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) ea++;
			else oa++;
		}
		int arr1[] = new int[ea];
		int j=0;
		int arr2[] = new int[oa];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) 
				arr1[j++] = arr[i];
			else 
				arr2[k++] = arr[i];
		}
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr1[] = {};
		int arr[] = {30, 37, 49, 53, 21, 36, 55};
		getTheArrays(arr);

	}

}
