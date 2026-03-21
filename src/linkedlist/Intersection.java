package linkedlist;

//Problem: 160. Intersection of 2 linked lists
//Platform: Leetcode
//Problem Link: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class Intersection {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0;
        ListNode t1 = headA;
        while(t1 != null){
            t1 = t1.next;
            l1++;
        }
        int l2 = 0;
        ListNode t2 = headB;
        while(t2 != null){
            t2 = t2.next;
            l2++;
        }
        t1 = headA;
        t2 = headB;
        if(l1>l2){
            for(int i = 1; i<= l1-l2;i++){
                t1 = t1.next;
            }
        }
        else{
            for(int i = 1; i <=l2-l1;i++){
                t2 = t2.next;
            }
        }
        while(t1!=t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(4); 
		ListNode n2 = new ListNode(1); n1.next = n2;
		ListNode n3 = new ListNode(8); n2.next = n3;
		ListNode n4 = new ListNode(4); n3.next = n4;
		ListNode n5 = new ListNode(4); n4.next = n5;
		
		ListNode m1 = new ListNode(5); 
		ListNode m2 = new ListNode(6); m1.next = m2;
		ListNode m3 = new ListNode(1); m2.next = m3;
		m3.next = n3;
		System.out.println(getIntersectionNode(n1, m1).val);
	}

}
