public class StringExample {
    void string(String s) {
        char[] arr = s.toCharArray();
        String rev = "";
        for (int j = arr.length - 1; j >= 0; j--) {
            char c = arr[j];
            rev += c;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        StringExample n = new StringExample();
        String s = "Shishir";
        n.string(s);
    }
}
