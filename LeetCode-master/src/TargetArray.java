import java.util.HashMap;
import java.util.Map;

public class TargetArray {
	
//	static void getSum(int a[],int target) {
//		int sum = 0 ;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				sum = a[i]+a[j];
//				if(sum == target) {
//					System.out.println(a[i]+" "+a[j]);
//				}
//			}
//		}
//	}
//	
	  static void getSum(int a[], int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < a.length; i++) {
	            int cur = a[i];
	            int x = target - cur;
	            if (map.containsKey(x)) {
	                System.out.println(a[map.get(x)] + " " + cur);
	                return;
	            }
	            map.put(cur, i);
	        }
	        System.out.println("No pair found.");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,6,4,8,1,9};
		int target = 10;
		getSum(a,target);
	}

}
