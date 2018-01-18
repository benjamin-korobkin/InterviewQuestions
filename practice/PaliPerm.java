package practice;
//checks whether any permutation of a string is a palindrome.
public class PaliPerm 
{
	public static boolean check(String str)
	{		
		if (str.length() <= 1) return true;
		boolean oneDropped = false;
		int times = str.length()/2;
		if (str.length() % 2 == 1) times += 1;
	
		for (int i = 0; i < times; i++)
		{
			StringBuffer sb = new StringBuffer(str);
			String compare = sb.substring(0,1);
			int find = sb.indexOf(compare, 1); // search rest of string.
			
			if (find == -1) // char not found.
			{
				if (oneDropped == false)
				{
					oneDropped = true;
					str = str.substring(1);
				}
				else return false;
			}
			else // we found a pair
			{
				sb = sb.deleteCharAt(find);
				str = sb.substring(1);
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(check("civic"));
		System.out.println(check("ivicc"));
		System.out.println(check("civil"));
		System.out.println(check("livci"));
	}
}
