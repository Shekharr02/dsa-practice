package linkedlist;

//Problem: Search in a LinkedList
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class Search {

	public static boolean searchKey(ListNode head, int key) {
        // Code here
        ListNode temp = head;
        while(temp!=null){
            if(temp.val == key) return true;
            temp=temp.next;
        }
        return false;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println(searchKey(ll.head, 3));
	}

}
