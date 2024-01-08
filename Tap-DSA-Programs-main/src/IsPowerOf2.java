public class IsPowerOf2 {

    static boolean isPowOf2(int n){
        if(n==0) return false;
        return ( n&(n-1) )== 0;
    }


    public static void main(String[] args) {
        int n=10;
        System.out.println(isPowOf2(n));
    }
}
