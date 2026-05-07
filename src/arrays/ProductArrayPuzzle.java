package arrays;

import java.util.Arrays;

//Problem: Product Array Puzzle
//Platform: GeeksforGeeks
//Problem Link : https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class ProductArrayPuzzle {

	public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * rightProduct;
            rightProduct = rightProduct * arr[i];
        }
        
        return res;
    }
	public static void main(String[] args) {
		int [] arr = {10,3,5,6,2};
		System.out.println(Arrays.toString(productExceptSelf(arr)));
	}

}
