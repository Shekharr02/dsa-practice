package stack;

import java.util.Stack;

//Problem: Get min at top
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/get-min-at-pop/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class MinAtTop {

	public static Stack<Integer> _push(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<n; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            else{
                int minStack = Math.min(arr[i], stack.peek());
                stack.push(minStack);
            }
        }
        return stack;
    }

    static void _getMinAtPop(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		Stack<Integer> stack = _push(arr, arr.length);
		_getMinAtPop(stack);
	}

}
