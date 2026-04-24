package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversa {
	public static void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> stk = new Stack<>();
        while(!q.isEmpty()){
            stk.push(q.remove());
        }
        while(!stk.isEmpty()){
            q.add(stk.pop());
        }
    }
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(25);
		System.out.println("Original Queue: "+q);
		reverseQueue(q);
		System.out.println("Reversed queue: "+q);
	}
}
