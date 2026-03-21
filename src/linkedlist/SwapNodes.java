package linkedlist;

//Problem: 1721.Swapping nodes in a linked list
//Platform: Leetcode
//Problem Link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/
//Difficulty: Medium
//Time Complexity: O(n)
//Space Complexity: O(1)

public class SwapNodes {
	public static ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i<=k;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast = head;
        for(int i = 1; i<=k-1; i++){
            fast = fast.next;
        }
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;
        return head;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(7);
		ll.add(9);
		ll.add(6);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(3);
		ll.add(0);
		ll.add(9);
		ll.add(5);
		swapNodes(ll.head, 5);
		ll.display();
	}

}
