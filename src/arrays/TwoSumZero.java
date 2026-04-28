package arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Problem: Two sum - pairs with 0 sum
//Platform: Geeksforgeeks
//Problem Link: https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?
//Difficulty: Easy
//Time Complexity: O(n log n)
//Space Complexity: O(1)
public class TwoSumZero {

	public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(arr == null || arr.length < 2) return result;
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum == 0){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                result.add(pair);
                i++;
                j--;
                while(i<j && arr[i] == arr[i-1]){
                    i++;
                }
                while(i<j && arr[j] == arr[j-1]){
                    j--;
                }
            }else if(sum < 0) i++;
            else j--;
        }
        return result;
    }
	public static void main(String[] args) {
		int arr [] = {-1,0,1,2,-1,-4};
		System.out.println(getPairs(arr));
	}

}
