package stack;

import java.util.Stack;

//Problem: Parenthesis Checker
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class ParanthesisChecker {

	public static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                else{
                    char top = stack.pop();
                    if( (ch==')' && top != '(') ||
                        (ch=='}' && top != '{') ||
                        (ch==']' && top != '[') ){
                            return false;
                        }
                }
            }
        }
        return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		String str = "[{()}]";
		System.out.println(isBalanced(str));
	}

}
