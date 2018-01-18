package practice;

import java.util.*;

public class Anagram
{
    public static int numberNeeded(String first, String second) 
    {
        int sentinel, amount = 0;
        StringBuilder bigger;
        StringBuilder smaller;
        String find;
        if (first.length() <= second.length())
        {
        	bigger = new StringBuilder(second);
        	smaller = new StringBuilder(first);
        	sentinel = smaller.length();
        }
        else
        {
        	bigger = new StringBuilder(first);
        	smaller = new StringBuilder(second);
        	sentinel = smaller.length();
        }
        
        for (int i = 0; i < sentinel; i++)
        {
        	find = smaller.substring(0,1); 
        	
        	int found = bigger.indexOf(find);
        	if (found != -1) // they both have the same char
        	{
        		smaller = smaller.deleteCharAt(0);
        		bigger = bigger.deleteCharAt(found);
        	}
        	else
        	{
        		amount++;
        		smaller = smaller.deleteCharAt(0);
        	}
        }
        
        amount += bigger.length();
        	
		return amount;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        System.out.println(numberNeeded(a, b));
    }
}