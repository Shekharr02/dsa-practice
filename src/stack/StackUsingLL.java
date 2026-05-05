package stack;

import java.util.LinkedList;

class myStack {
    private LinkedList<Integer> list;
    public myStack() {
        // Initialize your data members
        list = new LinkedList<>();
    }

    public boolean isEmpty() {
        if(list.size()==0) return true;
        else return false;
    }

    public void push(int x) {
    	list.addFirst(x);
    }

    public void pop() {
        if(list.size()>0) {
        	list.remove();
        }
    }

    public int peek() {
    	if(list.size()==0) return -1;
    	return list.element();
    }

    public int size() {
    	return list.size();
    }
}
public class StackUsingLL {

	public static void main(String[] args) {
		myStack stk = new myStack();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		System.out.println(stk.size());
		while(!stk.isEmpty()) {
			System.out.print(stk.peek()+" ");
			stk.pop();
		}
		System.out.println();
		System.out.println(stk.size());
	}

}
