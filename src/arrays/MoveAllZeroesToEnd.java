package arrays;

import java.util.Arrays;

// Problem: Move All Zeroes to End
// Platform: GeeksforGeeks
// Difficulty: Easy
// Topics: Arrays, Data Structures
// Time Complexity: O(n)
// Space Complexity: O(n) 



public class MoveAllZeroesToEnd {
	public static void pushZeroesToEnd(int [] arr) {
		int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
	}
	public static void main(String[] args) {
		int inputArray[] = {1,2,0,4,0,5,0};
		System.out.println("Input Array : "+Arrays.toString(inputArray));
		pushZeroesToEnd(inputArray);
		System.out.println("Array after moving zeroes to end : " +Arrays.toString(inputArray));
	}
}
