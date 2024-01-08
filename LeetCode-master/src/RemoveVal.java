
public class RemoveVal {
	static int getArr(int a[],int n) {
		int re = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=n) {
				a[re] = a[i];
				re++;
			}
		}return re;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int n = 5;
		
		System.out.println("Original array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		int k = getArr(a,n);
		
		System.out.println("\nArray after removing duplicates:");
		for (int i = 0; i < k; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nNumber of unique elements: " + k);
		
	}

}
