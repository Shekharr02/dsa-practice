package arrays;

import java.util.HashMap;

//Problem: ArraySubset
//Problem link: https://www.geeksforgeeks.org/problems/array
//Platform: GeeeksforGeeks
//Difficulty: Basic
//Time Complexity: O(n+m)
//Space Complexity: O(n)
 	
public class ArraySubset {

	public static boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : b){
            if(!map.containsKey(num)|| map.get(num) == 0){
                return false;
            }
            map.put(num, map.get(num) - 1);
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {11,7,1,13,21,3,7,3};
		int [] b = {11,3,7,1,7};
		System.out.println(isSubset(a, b));
	}

}
