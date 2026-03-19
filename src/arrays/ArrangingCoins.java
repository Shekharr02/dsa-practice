package arrays;

//Problem: 441. Arranging Coins
//Platform: LeetCode
//Problem Link: https://leetcode.com/problems/arranging-coins/description/
//Difficulty: Easy
//Time Complexity: O(1)
//Space Complexity: O(1)

public class ArrangingCoins {

	public static int arrangeCoins(int n) {
        long m = n;
        return (int) (Math.sqrt(8*m + 1) -1)/2;
    }
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println(arrangeCoins(n));
	}

}
