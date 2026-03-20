package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Problem: Power Set
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/power-set4302/1
//Difficulty: Medium
//Time Complexity: O(n*2^n)
//Space Complexity: O(n*2^n)

public class PowerSet {

	public static void subsets(String ans, String s, int idx, List<String> list){
        if(idx==s.length()){
          if(ans.length() != 0) list.add(ans);
          return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1, list);
        subsets(ans, s, idx+1, list);
    }
    public static List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> list = new ArrayList<>();
        subsets("", s, 0, list);
        Collections.sort(list);
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(AllPossibleStrings(str));
	}

}
