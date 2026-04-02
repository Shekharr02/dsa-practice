package stack;

import java.util.Stack;

public class ReverseString {

	public static String reverse(String S) {
		Stack<Character> stack = new Stack<>();
        for(int i = 0;i<S.length();i++){
            stack.push(S.charAt(i));
        }
        String string = "";
        while(!stack.isEmpty()) {
        	string+=stack.pop();

        }
        return string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Himanshu"));
	}

}
