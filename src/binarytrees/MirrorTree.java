package binarytrees;

//Problem: MirrorTree
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/mirror-tree/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)
public class MirrorTree {
	static void mirror(Node root) {
        // code here
        if(root == null) return;
        Node temp = root.right;
        root.right = root.left;
        root.left = temp;
        mirror(root.left);
        mirror(root.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		a.left = b; a.right = c;
		c.right = d;
		Implementation.display(a);
		mirror(a);
		System.out.println();
		Implementation.display(a);
	}

}
