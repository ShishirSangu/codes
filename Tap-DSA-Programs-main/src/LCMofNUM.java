public class LCMofNUM {

    static int gcdOfNum(int a, int b){
        while(a!=0 && b!=0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a!=0) return a;
        else return b;
    }

    static int lcmOfNum(int a, int b){
        return (a*b)/gcdOfNum(a,b);
    }

    public static void main(String[] args) {
        int a=3,b=7;
        System.out.println(lcmOfNum(a, b));
    }
}
