package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Problem: Make the array beautiful
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/make-the-array-beautiful--170647/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class BeautifulArray {

	public static List<Integer> makeBeautiful(int[] arr) {
        // code here
        List<Integer> beautiful = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : arr){
            if(stack.isEmpty()) stack.push(num);
            else if((stack.peek()<0 && num<0) || (stack.peek()>=0 && num>=0)){
                stack.push(num);
            }
            else stack.pop();
        }
        while(!stack.isEmpty()){
            beautiful.add(stack.pop());
        }
        return beautiful.reversed();
    }
	public static void main(String[] args) {
		int arr [] = {4,2,-2,1};
		System.out.println(makeBeautiful(arr));
	}

}
