package queue;


//Problem: Reverse fist k of queue
//Problem link: https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
//Platform: GeeeksforGeeks
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {

	public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Queue<Integer> q2 = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();
        if(q.size() < k) return q;
        for(int i = 0; i<k; i++){
            stk.push(q.remove());
        }
        while(!q.isEmpty()){
            q2.add(q.remove());
        }
        while(!stk.isEmpty()){
            q.add(stk.pop());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
        }
        return q;
    }
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		int k = 3;
		System.out.println(reverseFirstK(q, k));
	}

}
