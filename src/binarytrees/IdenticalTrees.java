package binarytrees;

//Problem: Identical Trees
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class IdenticalTrees {
	public static boolean isIdentical(Node r1, Node r2) {
        // code here
        if(r1 == null && r2 == null) return true;
        if(r1 == null || r2 == null) return false;
        if(r1.val != r2.val) return false;
        return isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
    }
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		a.left = b; a.right = c;
		c.right = d;
		Node a2 = new Node(1);
		Node b2= new Node(2);
		Node c2 = new Node(3);
		Node d2 = new Node(4);
		a2.left = b2; a2.right = c2;
		c2.right = d2;
		System.out.println(isIdentical(a, a2));
	}
}
