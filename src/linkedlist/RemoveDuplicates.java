package linkedlist;

//Problem: Remove duplicates from a sorted linked list
//Platform: leetcode
//Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class RemoveDuplicates {
	public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        while(temp.next != null){
            if(temp.val != temp.next.val) temp = temp.next;
            else{
                temp.next = temp.next.next;
            }
        }
        return head;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(1);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(3);
		deleteDuplicates(ll.head);
		ll.display();
	}

}


