
public class ExcelNumber {

	static void getNumber(String s) {
		
		if(s==null) System.out.println("Write correct one ");
		int sum = 0;
		
		String a = s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			char c = a.charAt(i);
			sum *= 26;
			sum += c - 'A' + 1;
		}System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AB";
		
		getNumber(s);

	}

}
