public class StringSeparation {

    static void getWord(String s) {
        s += " ";
        String changeWord = "This";
        String newWord = "shishir";
        String word = "";
        int end = 0, position = 0, count = 0;

        while (s.indexOf(' ', position) > 0) {
            end = s.indexOf(' ', position);
            word = s.substring(position, end);
            count++;
            
            if(changeWord == s) {
            	System.out.println(newWord + " " + word + " ");
            }
            
            System.out.print(word);
            System.out.println();

            position = end + 1;
        }
        
//        System.out.print(word);
        System.out.println("Word count: " + count);
    }


    public static void main(String[] args) {
        String s = "This is a String";
        getWord(s);
    }
}
