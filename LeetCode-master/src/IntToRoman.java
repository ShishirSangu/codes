
public class IntToRoman {
	
	static void getRoman(int num) { 
		int temp = num;
		int number[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		StringBuilder romanNum = new StringBuilder();
		
		for(int i=0;i<number.length;i++) {
			while(num >= number[i]) {
			romanNum.append(roman[i]);
			num -= number[i];
			}
		}
		System.out.println("Roman numeral representation of " + temp + " is : " + romanNum.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		getRoman(num);
	}

}
