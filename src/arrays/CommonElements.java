package arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Problem: Common Elements
// Platform: GeeksforGeeks
// Difficulty: Easy
// Topics: Java, STL, Java-Collections
// Time Complexity: O(n log n)
// Space Complexity: O(n) 


public class CommonElements {

	public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]) {
                result.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else j++;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int [] inputArray1 = {3,6,1,7,9,8,2,2};
		int [] inputArray2 = {9,7,3,4,9};
		System.out.println(commonElements(inputArray1,inputArray2));

	}

}
