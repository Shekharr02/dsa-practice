package arrays;

import java.util.ArrayList;

// Problem Link: https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
// Platform: GeeksforGeeks
// Difficulty: Medium
// Topics: Arrays, Data Structures, 2-pointer-algorithm
// Time Complexity: O(n+m)
// Space Complexity: O(1)


public class UnionOf2SortedArrays {

	public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }
            else{
                if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
	public static void main(String[] args) {
		int inputArray1 [] = {2,2,3,4,5};
		int inputArray2 [] = {1,1,2,3,4};
		System.out.println(findUnion(inputArray1, inputArray2));
	}

}
