package recursion;

import java.util.ArrayList;

//Problem: Subset Sums
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/subset-sums2234/0
//Difficulty: Medium
//Time Complexity: O(2^n)
//Space Complexity: O(2^n)

public class SubsetSums {

	public static void subset(int ans, int [] arr, int idx, ArrayList<Integer> list){
        if(idx==arr.length){
            list.add(ans);
            return;
        }
        subset(ans+arr[idx], arr, idx+1,list);
        subset(ans, arr, idx+1,list);
    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        subset(0, arr, 0, list);
        return list;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,6,7};
		System.out.println(subsetSums(arr));
	}

}
