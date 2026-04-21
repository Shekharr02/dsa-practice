package linkedlist;

//Problem: 237.Delete a Node in a Linked List
//Platform: Leetcode
//Problem Link: https://leetcode.com/problems/delete-node-in-a-linked-list/
//Difficulty: Medium
//Time Complexity: O(1)
//Space Complexity: O(1)

public class FindNodatKth {
		public static int GetNth(ListNode head, int index) {
	        ListNode temp = head;
	        for(int i = 1; i<index; i++){
	            if(temp == null) return -1;
	            temp = temp.next;
	        }
	        return temp.val;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(4);
		ll.add(5);
		ll.add(1);
		ll.add(9);
		System.out.println((int) GetNth(ll.head, 4) );
	}

}
