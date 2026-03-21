package linkedlist;

//Problem: Kth from end of a linked list
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class KthFromEnd {
	static int getKthFromLast(ListNode head, int k) {
        // Your code here
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1;i<=k;i++){
            if(fast == null) return -1;
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		System.out.println(getKthFromLast(ll.head, 2));
	}

}


