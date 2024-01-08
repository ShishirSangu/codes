public class ConsecutiveOne {

    static int consecutiveOne(int n){
        int count = 0;

        while(n>0) {
            n = n & (n << 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 101;
        System.out.println(consecutiveOne(n));
    }
}
