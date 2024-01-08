public class LonelyInteger {

    static int lonelyInteger(int[] a){
        int result = 0;
        for(int i : a){
            result = result ^ i;
        }return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,4,5,4,3,2,1,5};
        System.out.println(lonelyInteger(a));
    }
}
