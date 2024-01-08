public class ArrayTry {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 100; number < 1000; number++) {
        
            int[] digit = getDigits(number);
            int sumEven = 0;
            int sumOdd = 0;
            
            for (int i = 0; i < digit.length; i++) {
                if (i % 2 == 0) {
                    sumEven += digit[i];
                } else {
                    sumOdd += digit
                    		[i];
                }
            }
            
            if (sumEven == sumOdd) {
                System.out.println(number);
                count++;
            }
        }
        
        System.out.println("Total count: " + count);
    }
    
    private static int[] getDigits(int number) {
        int[] digits = new int[3];
        digits[0] = number / 100;       // hundreds place digit
        digits[1] = (number / 10) % 10; // tens place digit
        digits[2] = number % 10;        // ones place digit
        return digits;
    }
}
