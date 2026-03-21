package linkedlist;

//Problem: Delete Middle of a linked list
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class DeleteMiddle {
	static ListNode deleteMid(ListNode head) {
        if(head.next == null){
            head = null;
            return head;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode middle = head;
        while(fast != null && fast.next!=null){
            middle = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        middle.next = slow.next;
        return head;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		deleteMid(ll.head);
		ll.display();
	}

}


