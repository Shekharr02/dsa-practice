package strings;

//Problem: 242.Valid Anagram
//Platform: Leetcode
//Problem Link: https://leetcode.com/problems/valid-anagram/description/
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)


import java.util.Arrays;

public class Anagram {
	
	public static boolean areAnagrams(String s1, String s2) {
        // Your code here
        char [] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        char [] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)) return true;
        else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "silent";
		String s2 = "listen";
		System.out.println(areAnagrams(s1, s2));
	}

}
