package recursion;


//Problem: Look and say pattern
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/decode-the-pattern1138/1
//Difficulty: Medium
//Time Complexity: O(2^n)
//Space Complexity: O(2^n)


public class LookAndSay {

	public static String countAndSay(int n) {
        // code here
        if(n==1) return "1";
        String s = countAndSay(n-1)+"#";
        String ans = "";
        int i = 0, j = 0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                int freq = j-i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int n = 5;
		System.out.println(countAndSay(n));
	}

}
