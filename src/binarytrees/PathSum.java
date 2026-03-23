package binarytrees;

//Problem: Path Sum
//Platform: Leetcode
//Problem Link:https://leetcode.com/problems/path-sum/submissions/1956731133/
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class PathSum {

	public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(targetSum == root.val) return true;
            else return false;
        }
        return hasPathSum(root.left, targetSum - root.val) || 
            hasPathSum(root.right, targetSum - root.val);
    }
	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(4);
		Node c = new Node(8);
		Node d = new Node(11);
		Node e = new Node(7);
		Node f = new Node(2);
		Node g = new Node(13);
		Node h = new Node(4);
		Node i = new Node(1);
		a.left = b; a.right = c;
		b.left = d; 
		d.left = e; d.right = f;
		c.left = g; c.right = h;
		h.right = i;
		System.out.println(hasPathSum(a, 22));
	}

}
