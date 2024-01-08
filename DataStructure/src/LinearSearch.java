
public class LinearSearch {

	static void LS(int arr[], int num) {
		for (int i=0;i<=arr.length-1;i++) {
			if(num == arr[i]) {
				System.out.println("At "+"'"+i+"'"+" index "+arr[i]+" is present");
			}
		}System.out.println("Not preset");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50, 40, 90, 70, 45};
		LinearSearch LL = new LinearSearch();
		LL.LS(arr, 55);
	}

}
