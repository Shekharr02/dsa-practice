package linkedlist;

//Problem: Length of a Linked list
//Platform: GeeksforGeeks
//Problem Link: https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class Length {

	public static int getCount(ListNode head) {
        // code here
        ListNode temp = head;
        int length = 1;
        if(temp==null) return 0;
        if(temp.next==null) return length;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
	public static void main(String[] args) {
		Linkedlist l1 = new Linkedlist();
		l1.add(1);l1.add(2);l1.add(3);l1.add(4);l1.add(5);
		System.out.println(getCount(l1.head));
	}

}
