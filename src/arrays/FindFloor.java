package arrays;

// Problem: Find floor
// Platform: GeeksforGeeks
// Problem Link: https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
// Difficulty: Easy
// Time Complexity: O(log n)
// Space Complexity: O(1)


public class FindFloor {
	
	public static int findFloor(int[] arr, int x) {
        int lo = 0;
        int hi = arr.length-1;
        int idx=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>x) hi = mid-1;
            else{
                idx=mid;
                lo = mid+1;
            }
        }
        return idx;
    }
	
	public static void main(String[] args) {
		 int inptArray[] = {1,2,8,10,10,12,19};
		 System.out.println(findFloor(inptArray, 5));
	}

}
