package LeetCode;

public class Reverse_Integer
{
	public static int reverse(int x)
	{
		long tmp = 0;
		while (x != 0)
		{
			tmp = tmp * 10 + x % 10;
			x /= 10;
		}
		
		if (tmp < Integer.MAX_VALUE && tmp > Integer.MIN_VALUE)
			return (int)tmp;
		return 0;
	}
}

