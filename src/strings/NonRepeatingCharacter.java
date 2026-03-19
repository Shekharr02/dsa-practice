package strings;


// Problem: Non Repeating character
// Platform: GeeksforGeeks 
// Problem Link: https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

public class NonRepeatingCharacter {
	
	public static char nonRepeatingChar(String s) {
        // code here
        int freq [] = new int [26];
        for(int i = 0; i< s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i = 0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1) return s.charAt(i);
        }
        return '$';
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		System.out.println(nonRepeatingChar(s));
	}

}
