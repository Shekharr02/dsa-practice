package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
	
	public static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int max = -1;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                result.addFirst(max);
            }
        }
        Collections.sort(result);
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {16,17,4,3,5,2};
		System.out.println(leaders(arr));
	}

}
