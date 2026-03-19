package arrays;


//Problem: Single among doubles in a sorted array
//Platform: GeeksforGeeks
//Problem Link: https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
//Difficulty: Medium
//Time Complexity: O(log n)
//Space Complexity: O(1)

public class SingleAmongDoubles {
	
	public static int single(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!= arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int lo = 0;
        int hi = n-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            int f = mid, s = mid;
            if(arr[mid-1]== arr[mid]) f = mid-1;
            else s = mid+1;
            int leftCount = f-lo;
            int rightCount = hi-s;
            if(leftCount%2 == 0) lo = s+1;
            else hi = f - 1;
        }
        return 0;
    }
	public static void main(String[] args) {
		int inputArray[] = {1,1,2,2,3,3,4,50,50,65,65};
		System.out.println(single(inputArray));
	}

}
