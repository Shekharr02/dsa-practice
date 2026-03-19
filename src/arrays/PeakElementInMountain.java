package arrays;


// Problem: Peak index in a mountain array
// Platform: Leetcode
// Problem link: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Difficulty: Medium
// Time Complexity: O(log n)
// Space Complexity: O(1)


public class PeakElementInMountain {

	public static int peakIndexInMountainArray(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int idx = -1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<arr[mid+1]) lo = mid+1;
            else hi = mid;
        }
        return lo;
    }
	public static void main(String[] args) {
		int inputArray []= {0,10,5,2};
		System.out.println(peakIndexInMountainArray(inputArray));
	}

}
