package linkedlist;

public class DeleteNode {
	public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(4);
		ll.add(5);
		ll.add(1);
		ll.add(9);
		ll.display();
		System.out.println();
		deleteNode(ll.head.next);
		ll.display();
	}

}
