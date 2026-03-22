package linkedlist;

//Problem: 142. Linked List Cycle II
//Platform: leetcode
//Problem Link: https://leetcode.com/problems/linked-list-cycle-ii/description/
//Difficulty: Medium
//Time Complexity: O(n)
//Space Complexity: O(1)

public class LoopNode {
	
	public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                ListNode ans = head;
                while(ans!= slow){
                    ans = ans.next;
                    slow = slow.next;
                }
                return ans;
            }
        }
        return null;
    }
	public static void main(String[] args) {
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(2); n1.next = n2;
		ListNode n3 = new ListNode(0); n2.next = n3;
		ListNode n4 = new ListNode(-4); n3.next = n4;
		n4.next = n2;
		System.out.println(detectCycle(n1).val);
	}

}

