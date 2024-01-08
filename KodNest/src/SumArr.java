import java.util.Scanner;

public class SumArr {
	
	static int max(int arr[]) {
		int max = arr[0];
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>max){
				max = arr[i];
			}
//			sum = sum + arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int len = scan.nextInt();
		int arr[]=new int[len];
		
		
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the element for index : "+i);
			arr[i]=scan.nextInt();
			
		}
		
		int max  = SumArr.max(arr);
		
		System.out.println("Display the numbers : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the sum all the numbers : \n"+max);
//		for(int i=0;i<=arr.length-1;i++) {
//			System.out.println(sum+" ");
//		}
		
		}

}
