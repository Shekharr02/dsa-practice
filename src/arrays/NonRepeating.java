package arrays;

import java.util.HashMap;

//Problem: Non repeating element
//Platform: GeeksforGeeks
//Problem Link: https://www.geeksforgeeks.org/problems/non-repeating-element3958/1
//Difficulty: Easy
//Topics: Arrays, Hash
//Time Complexity: O(n)
//Space Complexity: O(n) 

 class NonRepeating {
	 
	 public static int firstNonRepeating(int[] arr) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int num : arr){
	            map.put(num, map.getOrDefault(num,0)+1);
	        }
	        for( int num : arr){
	            if(map.get(num) == 1){
	                return num;
	            }
	        }
	        return 0;
	    }

	public static void main(String[] args) {
		int arr [] = {1,1,1};
		System.out.println(firstNonRepeating(arr));
	}

}
