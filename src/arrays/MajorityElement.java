package arrays;

//Problem: Majority Element 
//Platform: GeeksforGeeks
//Problem Link: https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
//Difficulty: 
//Time Complexity: O(n)
//Space Complexity: O(1)

public class MajorityElement {
	static int majorityElement(int arr[]) {
        int candidate = -1;
        int votes = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (votes == 0) {
                candidate = arr[i];
                votes = 1;
            } else if (arr[i] == candidate) {
                votes++;
            } else {
                votes--;
            }
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count > size / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
	public static void main(String[] args) {
		int arr[] = {1,1,2,1,3,5,1};
		System.out.println(majorityElement(arr));
	}
}
