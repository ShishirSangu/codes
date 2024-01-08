public class PowerOfRMSB {

    static int powOfRMSB(int n){
//        int m=1;
//        int pos=0;
//        while((n&m) == 0){
//            m=m<<1;
//            pos++;
//        }return pos+1;

        return ((int) ((Math.log10(n^(n&(n-1))))/Math.log10(2)))+1;
    }

    public static void main(String[] args) {
        int n=40;
        System.out.println(powOfRMSB(n));
    }
}
