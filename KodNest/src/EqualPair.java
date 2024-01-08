
public class EqualPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{10,3,4,6,1,9,10,0};
	    int sum=0;

	    for (int i=0;i<array.length;i++)
	    {
	      for (int j=i ; j<array.length;j++){


	        sum = array[i] + array[j];
	        if (sum==10){

	          System.out.println(array[i] + " " + array[j]);

	        }
	     }
	    
	  }
	}
}
