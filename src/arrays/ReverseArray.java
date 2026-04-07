package arrays;

//Problem: Reverse an Array
//Problem link : http://geeksforgeeks.org/problems/reverse-an-array/1
//Platform: GeeksforGeeks
//Difficulty: Easy
//Topics: Arrays
//Time Complexity: O(n)
//Space Complexity: O(1) 

import java.util.Arrays;

public class ReverseArray {

	public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
	public static void main(String[] args) {
		int arr [] = {1,4,3,2,6,5};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
