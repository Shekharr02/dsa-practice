package arrays;

import java.util.ArrayList;

// Problem: First and Last Occurrences
// Platform: GeeksforGeeks
// Problem Link: https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
// Difficulty: Medium
// Time Complexity: O(log n)
// Space Complexity: O(1)


public class FirstAndLastOccrrences {

	public static ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int lo = 0;
        int hi = arr.length -1;
        int idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<x) lo = mid + 1;
            else if(arr[mid]>x) hi = mid - 1;
            else {
                if(arr[mid]== x) {
                    idx = mid;
                    hi = mid-1;
                }
            }
        }
        result.add(idx);
        lo = 0;
        hi = arr.length-1;
        idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<x) lo = mid + 1;
            else if(arr[mid]>x) hi = mid - 1;
            else {
                if(arr[mid]== x) {
                    idx = mid;
                    lo = mid+1;
                }
            }
        }
        result.add(idx);
        return result;
    }
	public static void main(String[] args) {
		int inputArray [] = {1,3,5,5,5,5,67,23,125};
		int x = 5;
		System.out.println(find(inputArray, x));
	}

}
