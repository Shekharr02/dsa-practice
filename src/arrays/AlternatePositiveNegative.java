package arrays;

import java.util.ArrayList;

//Problem: Alternate positive negative
//Platform: GeeksforGeeks
//Problem Link: https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class AlternatePositiveNegative {

	static void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }
        
        int i = 0; 
        int j = 0; 
        int k = 0; 
        while (i < pos.size() && j < neg.size()) {
            arr.set(k++, pos.get(i++));
            arr.set(k++, neg.get(j++));
        }
        while (j < neg.size()) {
            arr.set(k++, neg.get(j++));
        }
        while (i < pos.size()) {
            arr.set(k++, pos.get(i++));
        }
        
    }
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(4);
		list.add(-2);
		list.add(-1);
		list.add(5);
		list.add(0);
		list.add(-5);
		list.add(-3);
		list.add(2);
		rearrange(list);
		System.out.println(list);
	}

}
