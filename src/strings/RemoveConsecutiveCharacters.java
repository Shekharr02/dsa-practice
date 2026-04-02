package strings;

//Problem: Remove consecutive characters from a given string
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/consecutive-elements2306/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class RemoveConsecutiveCharacters {
	public static String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int j = 0;
        sb.append(s.charAt(j));
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(j)){
                sb.append(s.charAt(i));
                j=i;
            }
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabb";
		System.out.println(removeConsecutiveCharacter(s));
	}

}
