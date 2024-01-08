
public class CharEx {
	
	static void charEx(char arr[]) {
	
		String str = "";   
		
		
		for(int i=0;i<arr.length;i++) {
			// ASCHI char
//			System.out.println(i+" "+arr[i]+" "+(int)arr[i]);
			
			// Is UpperCase
//			if(Character.isUpperCase(arr[i]))
//			System.out.println(arr[i]);
			
			// strings
			if(Character.isUpperCase(arr[i]))
//				str += arr[i];
				str += Character.toLowerCase(arr[i]);
			else
				str += Character.toUpperCase(arr[i]);
		}System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NO26 Sound";
 		char arr[] = str.toCharArray();
 		charEx(arr);
	}

}
