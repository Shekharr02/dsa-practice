package linkedlist;

//Problem: Merge two sorted linked lists
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
//Difficulty: Medium
//Time Complexity: O(n+m)
//Space Complexity: O(1)

public class MergeTwoSortedList {

	static ListNode sortedMerge(ListNode head1, ListNode head2) {
        // code here
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if(head1 != null) temp.next = head1;
        if(head2 != null) temp.next = head2;
        return dummy.next;
    }
	
	public static void main(String[] args) {
		Linkedlist l1 = new Linkedlist();
		l1.add(5);l1.add(10);l1.add(15);l1.add(40);
		Linkedlist l2 = new Linkedlist();
		l2.add(2); l2.add(3); l2.add(20);
		ListNode temp = sortedMerge(l1.head, l2.head);
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}

}
