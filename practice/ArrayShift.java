package practice;

import java.util.*;

public class ArrayShift {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // # of ints in array
		int k = in.nextInt(); // # of shifts
		
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) 
		{
			a[a_i] = in.nextInt(); // fill the array
		}
		in.close();
		for (; k > 0; k--) 
		{
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) 
			{
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
		}

		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
