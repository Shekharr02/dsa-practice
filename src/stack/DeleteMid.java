package stack;

import java.util.Stack;

//Problem: Delete middle of a stack
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class DeleteMid {

	public static void deleteMiddle(Stack<Integer> s, int n, int current){
        if(current == n/2){
            s.pop();
            return;
        }
        int top = s.pop();
        deleteMiddle(s, n, current+1);
        s.push(top);
    }
    public static void deleteMid(Stack<Integer> s) {
        // code here
        if(s == null || s.isEmpty()){
            return;
        }
        int n = s.size();
        deleteMiddle(s, n, 0);
    }
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		deleteMid(stack);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
