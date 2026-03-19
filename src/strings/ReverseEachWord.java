package strings;


// Problem: Reverse each word in a given string
// Platform: GeeksforGeeks 
// Problem Link: https://www.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string1001/1
// Difficulty: Medium
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ReverseEachWord {

	public static String reverseWords(String s) {
		 String rev[] = s.split("\\s+");
			StringBuilder result = new StringBuilder();
			for(String ele : rev) {
				StringBuilder st = new StringBuilder(ele);
				result.append(st.reverse()+" ");
			}
			return result.toString().trim(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cb ipctpyru  bovcbo";
		System.out.println(reverseWords(s));
	}

}
