package recursion;

//Problem: Tower of Hanoi
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
//Difficulty: Medium
//Time Complexity: O(1)
//Space Complexity: O(1)

public class TowerOfHanoi {

	public static int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        return (int)(Math.pow(2,n)-1);
    }
	public static void main(String[] args) {
		System.out.println(towerOfHanoi(4, 1, 2, 3));
	}

}
