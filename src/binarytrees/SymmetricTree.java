package binarytrees;

//Problem: Symmetric Tree
//Platform: Geeksforgeeks
//Problem Link:geeksforgeeks.org/problems/symmetric-tree/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class SymmetricTree {
	public static void mirror(Node root){
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    public static boolean isIdentical(Node r1, Node r2){
        if(r1 == null && r2 == null) return true;
        if(r1 == null || r2 == null) return false;
        if(r1.val != r2.val) return false;
        return isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
    }
    public static boolean isSymmetric(Node root) {
        // code here
        mirror(root.left);
        return isIdentical(root.left, root.right);
    }
	public static void main(String[] args) {
		Node a = new Node(10);
		Node b = new Node(5);
		Node c = new Node(5);
		Node d = new Node(2);
		Node e = new Node(2);
		a.left = b; a.right = c;
		c.left = d; b.right = e;
		System.out.println(isSymmetric(a));
	}
}
