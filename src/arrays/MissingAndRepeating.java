package arrays;

import java.util.ArrayList;

//Problem: Missing and repeating
//Platform: GeeksforGeeks
//Difficulty: Easy
//Topics: Arrays
//Time Complexity: O(n)
//Space Complexity: O(1) 

public class MissingAndRepeating {

	public static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int repeating = -1;
        int missing = -1;
        
        for(int i = 0; i<n; i++){
            int absVal = Math.abs(arr[i]);
            if(arr[absVal - 1] < 0){
                repeating = absVal;
            }
            else{
                arr[absVal - 1] = -arr[absVal - 1];
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i]>0){
                missing = i + 1;
            }
            else{
                arr[i] = Math.abs(arr[i]);
            }
        }
        result.add(repeating);
        result.add(missing);
        return result;
    }
	public static void main(String[] args) {
		int arr [] = {4,3,6,2,1,1};
		System.out.println(findTwoElement(arr));
	}

}
