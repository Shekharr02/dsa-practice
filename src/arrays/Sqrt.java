package arrays;

// Problem: Find square root of a given number (x)
// Platform: Leetcode
// Problem Link: https://leetcode.com/problems/sqrtx/description/
// Difficulty: Easy
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class Sqrt {
	
	public static int mySqrt(int x) {
        if (x == 0) return 0;
        int lo = 1, hi = x;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid == x/mid) return mid;
            else if(mid < x/mid) lo = mid+1;
            else hi = mid-1;
        }
        
        return hi;
    }
	public static void main(String[] args) {
		int input = 4;
		System.out.println(mySqrt(input));
	}
}
