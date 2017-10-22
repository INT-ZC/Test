import java.util.Scanner;

public class Prime_Number
{
	public static void main(String[] args)
	{
		Scanner data = new Scanner(System.in);
		
		int N = data.nextInt();
		
		if (N >= 1 && N <= 1000)
		{
			for (int i = 2; i < N; i++)
			{
				if (isPrime(i) == true)
				{
					System.out.println(i);
				}
			}
		}
	}
	
	public static boolean isPrime (int num)
	{
		for (int i = 2; i < num; i++)
		{
			for (int j = 2; j < num; j++)
			{
				if (i * j == num)
				{
					return false;
				}
			}
		}
		return true;
	}
}
