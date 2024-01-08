
public class BinaryAdd {
	
	static void getAnswer(String f, String s){
		StringBuilder res = new StringBuilder();
		int i=f.length()-1;
		int j=s.length()-1;
		int carry = 0;
		
		while(i>=0 || j>=0) {
			int sum = carry;
			if(i>=0) sum += f.charAt(i--)-'0';
			if(j>=0) sum += s.charAt(j--)-'0';
			carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        System.out.println(res.reverse().toString());
    
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String f = "11";
		String s = "1";
		
		getAnswer(f,s);
	}

}
