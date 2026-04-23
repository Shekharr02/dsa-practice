package arrays;

import java.util.HashMap;

//Problem: Check equal arrays
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class CheckEqual {
	
	public static boolean checkEqual(int[] a, int[] b) {
        // code here
        if(a.length != b.length) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : b){
            if(!map.containsKey(num)) return false;
            map.put(num, map.get(num)-1);
            if(map.get(num)==0) map.remove(num);
        }
        return map.isEmpty();
    }

	public static void main(String[] args) {
		int a [] = {1,2,5,4,0};
		int b [] = {2,4,5,0,1};
		System.out.println(checkEqual(a, b));
	}

}
