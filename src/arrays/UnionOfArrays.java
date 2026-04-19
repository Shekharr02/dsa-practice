package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//Problem: Union of array with duplicates
//Problem link: https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
//Platform: GeeeksforGeeks
//Difficulty: Easy
//Time Complexity: O(n+m)
//Space Complexity: O(n+m)
//http://geeksforgeeks.org/problems/union-of-two-arrays3538/1

public class UnionOfArrays {
	public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< a.length; i++){
            set.add(a[i]);
        }
        for(int i = 0; i< b.length; i++){
            set.add(b[i]);
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;
    }

	public static void main(String[] args) {
		int a [] = {1,2,3,2,1};
		int b [] = {3,2,2,3,3,2};
		
		System.out.println(findUnion(a, b));
	}

}
