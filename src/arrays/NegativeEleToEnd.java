package arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Problem: Move all negative elements to end
//Platform: GeeksforGeeks
//Problem Link: https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
//Difficulty: Easy
//Topics: Arrays, Data Structures
//Time Complexity: O(n)
//Space Complexity: O(n) 

public class NegativeEleToEnd {
	public static void segregateElements(int[] arr) {
        // Your code goes here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i< arr.length;i++){
            if(arr[i]<0) list.add(arr[i]);
            else list2.add(arr[i]);
        }
        int i = 0;
        for(int j = 0; j<list2.size();j++){
            arr[i]=list2.get(j);
            i++;
        }
        for(int j = 0; j < list.size(); j++){
            arr[i]=list.get(j);
            i++;
        }
    }

	public static void main(String[] args) {
		int arr [] = {-5,7,-3,-4,9,10,-1,11};
		segregateElements(arr);
		System.out.println(Arrays.toString(arr));
	}

}
