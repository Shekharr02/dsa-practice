package linkedlist;

//Problem: Middle of a linked list
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class MiddleOfLinkedList {
	static int getMiddle(ListNode head) {
        ListNode tempSlow = head;
        ListNode tempFast = head;
        while(tempFast != null && tempFast.next!=null){
            tempSlow = tempSlow.next;
            tempFast = tempFast.next.next;
        }
        return tempSlow.val;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.display();
		System.out.println();
		System.out.println(getMiddle(ll.head));
	}

}

