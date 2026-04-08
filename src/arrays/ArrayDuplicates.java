package arrays;

//Problem: Find duplicates from an array
//Problem link: https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
//Platform: GeeeksforGeeks
//Difficulty: Easy
//Time Complexity: O(log n)
//Space Complexity: O(1)

import java.util.ArrayList;

public class ArrayDuplicates {
	
	public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++ ){
            int index = Math.abs(arr[i]) - 1;
            if(arr[index]<0){
                list.add(index+1);
            }
            else{
                arr[index] = -arr[index];
            }
        }
        return list;
    }

	public static void main(String[] args) {
		int arr [] = {2, 3, 1, 2, 3};
		System.out.println(findDuplicates(arr));
	}

}
