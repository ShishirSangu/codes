//import java.util.ArrayList;
//import java.util.List;


class FizzBuzz {

    static void passNum(int n){
        if(n%3==0 && n%5==0) {
            System.out.println(n+"  "+"FizzBuzz");
        } else if(n%3==0) {
            System.out.println(n+"  "+"Fizz");
        } else if(5%n==0) {
            System.out.println(n+"  "+"Buzz");
        }
    }

    public static void main(String args[]) {
        for(int i = 2; i <= 100; i++) {
            passNum(i);
        }
    }   
}

//import java.util.ArrayList;
//import java.util.List;
//
//class FizzBuzz {
//    public static List<String> fizzBuzz(int n) {
//        List<String> result = new ArrayList<>();
//        
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                result.add("FizzBuzz");
//            } else if (i % 3 == 0) {
//                result.add("Fizz");
//            } else if (i % 5 == 0) {
//                result.add("Buzz");
//            } else {
//                result.add(Integer.toString(i));
//            }
//        }
//        
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int n = 15;
//        List<String> fizzBuzzList = fizzBuzz(n);
//
//        for (String s : fizzBuzzList) {
//            System.out.print(s+" ");
//        }
//    }
//}

