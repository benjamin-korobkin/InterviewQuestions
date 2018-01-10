package practice;

//import java.util.Arrays;

public class RecursionQuestion 
{
	
	//int i = 0;
	public static int main(String args[]) 
	{
		int i,j,k,l=0;
		k = l++;
		j = ++k;
		i = j++;
		System.out.println(i);
		try{
			return i/j;
		}
		finally {}
		
/*	    char c = 1;
	    c++;
	    c += 1;
	    c += c; // this works for some reason.
*/	   //   c = c + c; doesn't work for some reason 
	      
	}
	  public static void change_i(int i) 
	  {
	      i = 2;
	      i *= 2;
	  }
	
	
 /*
 * Task 1: Implement a recursive method max(int[]arr, int i) which returns
 *  the maximum of all elements of the array with an index <= i.
 */
	
//    private static int max(int[] arr, int i) // arr = array of numbers. i = maximum index
//    {
//    	return 0;
//    }
	
/*
 * Task 2: Implement a boolean-method containsValue(int[] arr, int val) 
 * which returns true if one of the elements of arr matches val. 
 * The method should have two recursive calls: one which searches the first 
 * half of the array and one that searches the second half. 
 * You can use Arrays.copyOfRange(...).
 */
//    private static boolean containsValue(int[] arr, int val) {
//        if (arr.length > 1) {
//            if (arr[arr.length - 1] == val) {
//                return true;
//            }
//
//            return containsValue(Arrays.copyOfRange(arr, 0, arr.length-1), val);
//        }
//
//        return false;
//    }
    
	

}
