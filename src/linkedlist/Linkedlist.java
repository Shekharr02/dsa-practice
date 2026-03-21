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
		if(head == null) head = tail = temp;
		else {
			temp.next = head;
			head = temp;
		}
	}
}
