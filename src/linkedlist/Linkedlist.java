package linkedlist;

class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val = val;
	}
}
public class Linkedlist {
	ListNode head;
	ListNode tail;
	void add(int val) {
		ListNode temp =  new ListNode(val);
		if(tail == null) head = tail = temp;
		else {
			tail.next = temp;
			tail = temp;
		}
	}
	void display() {
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}
}
