package queue;

import java.util.LinkedList;
import java.util.Queue;

//Problem: Stack using queue
//Problem link: https://www.geeksforgeeks.org/problems/stack-using-two-queues/1
//Platform: GeeeksforGeeks
//Difficulty: Basic
//Time Complexity: O(n)
//Space Complexity: O(1)

class myStack {
    private Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        int size = q.size();
        q.add(x);
        for(int i = 0; i<size; i++){
            q.add(q.poll());
        }
    }

    void pop() {
        if(q.isEmpty()) return;
        q.poll();
    }

    int top() {
        if(q.isEmpty()) return -1;
        return q.peek();
    }

    int size() {
        return q.size();
    }
}
public class StackUsingQueue {    
	public static void main(String[] args) {
		myStack stk = new myStack();
		stk.push(10);
		stk.push(20);
		System.out.println(stk.size());
		System.out.println(stk.top());
		stk.pop();
		System.out.println(stk.top());
		System.out.println(stk.size());
	}

}
