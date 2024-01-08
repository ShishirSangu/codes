public class CountOfSetBit {

    static int countOfSB(int n){
        int count = 0;
        while(n>0){
            n = n & (n-1);
            count++;
        }return count;
    }

    public static void main(String[] args) {
        int n = 42;
        System.out.println(countOfSB(n));
    }
}
