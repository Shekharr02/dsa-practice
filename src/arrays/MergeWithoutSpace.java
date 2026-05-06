package arrays;

import java.util.Arrays;

//Problem: Merge without using extra space
//Platform: GeeksforGeeks
//Problem Link : https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
//Difficulty: Medium
//Time Complexity: O(n log n + m log m)
//Space Complexity: O(1) 

public class MergeWithoutSpace {

	public static void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int len = n + m;
        int gap = (len + 1) / 2;

        while (gap > 0) {
            int left = 0;
            int right = gap;

            while (right < len) {
                if (left < n && right < n) {
                    if (a[left] > a[right]) {
                        swap(a, left, a, right);
                    }
                }
                else if (left < n && right >= n) {
                    if (a[left] > b[right - n]) {
                        swap(a, left, b, right - n);
                    }
                }
                else {
                    if (b[left - n] > b[right - n]) {
                        swap(b, left - n, b, right - n);
                    }
                }
                
                left++;
                right++;
            }
            if (gap == 1) {
                break;
            }
            gap = (gap + 1) / 2;
        }
    }
    private static void swap(int []a1, int i, int[] a2, int j) {
        int temp = a1[i];
        a1[i] = a2[j];
        a2[j] = temp;
    }
	public static void main(String[] args) {
		int [] a = {2,4,7,10};
		int [] b = {2,3};
		mergeArrays(a, b);
		System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
	}

}
