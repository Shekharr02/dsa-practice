package stack;

import java.util.ArrayList;
import java.util.Stack;

//Problem: NextGreaterElement
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
//Difficulty: Medium
//Time Complexity: O(n)
//Space Complexity: O(n)

public class NextGreaterElement {

	public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int [] result = new int [n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = -1;
            else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : result){
            ans.add(num);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int arr [] = {1,3,2,4};
		System.out.println(nextLargerElement(arr));
	}

}
