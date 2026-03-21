package linkedlist;

//Problem: Detect loop in linked list
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
//Difficulty: Medium
//Time Complexity: O(n)
//Space Complexity: O(1)

public class DetectLoop {
	public static boolean detectLoop(ListNode head) {
        // code here
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3); n1.next = n2;
		ListNode n3 = new ListNode(4); n2.next = n3;
		n3.next = n2;
		System.out.println(detectLoop(n1));
	}

}


