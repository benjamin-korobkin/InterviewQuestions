package practice;

import java.util.*;

public class TwoSum {
	public static int[] findTwoSum(int[] list, int sum) 
	{
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < list.length; i++)
		{
			if (!myMap.isEmpty() && myMap.containsKey(sum - list[i]))
			{
				int[] answer = new int[] {myMap.get(sum - list[i]), i};
				return answer;
			}
			
			myMap.put(list[i], i);
		}
		
		return null;
	}		
	
	public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
        
        indices = findTwoSum(new int[] { 1 }, 12);
        if (indices == null) System.out.println("Success!");
        
        indices = findTwoSum(new int[] { 1, 3, 12, 13 }, 25);
        System.out.println(indices[0] + " " + indices[1]);
        
        indices = findTwoSum(new int[] { 44, 46 }, 90);
        System.out.println(indices[0] + " " + indices[1]);
        
        indices = findTwoSum(new int[] { 44, 46 }, 91);
        if (indices == null) System.out.println("Success!");
    }
}

/* NAIVE SOLUTION (semi-pseudo) runs in O(N^2)
for(int i = 0; i < list.length; i++)
	{
		for(int j = i+1; j < list.length; j++)
		{
			if(list[i] + list[j] == sum)
			{
				tmp[0] = i;
				tmp[1] = j;
  				return tmp;
			}
		}
*/	