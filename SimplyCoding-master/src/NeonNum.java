public class NeonNum {
    
    static int getNumber(int n) {
        int t = n;
        int sq = n * n;
        int s = 0;
        
        while (sq != 0) {
            int d = sq % 10;
            s += d;
            sq = sq / 10;
        }
        
        if (s == t) {
            return t;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            int res = getNumber(i);
            if (res != -1) {
                System.out.println(res);
            }
        }
    }
}
