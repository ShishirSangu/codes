
class CommonFactor {
    public static int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
                System.out.println(count);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int res = CommonFactor.commonFactors(a, b);
        System.out.println(res);
        
        int arr= [10,20,30,50,40,60,70,90,80];
        int minimum = Math.mi(arr[]);
        
    }
}
