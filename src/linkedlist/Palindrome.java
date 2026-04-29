package linkedlist;

//Problem: Palindrome LinkedList
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
//Difficulty: Medium
//Time Complexity: O(n)
//Space Complexity: O(1)

public class Palindrome {

	public static  boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode half = reverseList(slow.next);
        
        ListNode a = head;
        ListNode b = half;
        boolean isPalindrome = true;
        while(isPalindrome && b != null){
            if(a.val != b.val){
                isPalindrome = false;
            }
            a = a.next;
            b = b.next;
        }
        slow.next = reverseList(half);
        return isPalindrome;
    }
    private static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while( curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(1);
		ll.add(2);
		ll.add(1);
		System.out.println(isPalindrome(ll.head));
		ll.display();
	}

}
