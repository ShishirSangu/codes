
public class ExcellChar {

	static void getExcelLetter(int a) {
		StringBuilder outPut = new StringBuilder();
		
		while(a > 0) {
			a--;
			char c = (char) (a%26 +'A');
			a/=26;
			outPut.append(c);
		}
		outPut.reverse();
		System.out.println(outPut.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 28;
		getExcelLetter(a);

	}

}
