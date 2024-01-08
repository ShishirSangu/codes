import java.util.Stack;

public class ValueParenthesis {
	
	static void getResult(String s) {
		
		Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                System.out.println(stack.push(c));
            } else {
//                if (stack.empty()) {
//                    System.out.println(stack.empty());;
//                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                    System.out.println(stack.pop());
                } else {
                    System.out.println("Nothing");;
                }
            }
        }
        System.out.println(stack.empty());;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "{[()]}";
		
		getResult(s);

	}

}
