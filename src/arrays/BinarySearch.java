package arrays;


// Problem: 704. Binary Search
// Problem link: https://leetcode.com/problems/binary-search/description/
// Platform: Leetcode
// Difficulty: Easy
// Time Complexity: O(log n)
// Space Complexity: O(1)


public class BinarySearch {

	public static int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int inputArray [] = {-1,0,3,5,9,12};
		int target = 9;
		System.out.println(search(inputArray, target));

	}

}
