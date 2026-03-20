package recursion;

//Problem: Generate Parentheses
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/power-set4302/1
//Difficulty: Medium
//Time Complexity: O(n*2^n)
//Space Complexity: O(n*2^n)


import java.util.ArrayList;
import java.util.List;

public class GenerateParntheses {
	
	public static void generate(int l, int r, String ans, int n, List<String> list){
        if(r == n){
            list.add(ans);
            return;
        }
        if(l<n) generate(l+1, r, ans+"(", n, list);
        if(r<l) generate(l, r+1, ans+")", n, list);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(0,0,"",n,ans);
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(generateParenthesis(n));
	}

}
