package arrays;

public class CheckIfArrayIsSorted {
	public static boolean isSorted(int[] arr) {
        // code here
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArr1[] = {10,20,30,40,50};
		int inputArr2[]= {90,80,100,70,40,30};
		System.out.println(isSorted(inputArr1));
		System.out.println(isSorted(inputArr2));
	}

}
