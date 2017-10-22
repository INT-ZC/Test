package HackerEarth.Basics_of_Implementation;

import java.util.Scanner;

public class Monk_and_Conversion_Game
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		int T = data.nextInt();
		
		if (T >= 1 && T <= 10)
		{
			for (int i = 0; i < T; i++)
				monk_and_conversion_game();
		}
	}
	
	public static void monk_and_conversion_game()
	{
		Scanner data = new Scanner(System.in);
		int N = data.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		int sA = 0;
		int sB = 0;
		
		for (int i = 0; i < N; i++)
			A[i] = data.nextInt();
		for (int i = 0; i < N; i++)
			B[i] = data.nextInt();
		
		for (int i : A)
			sA += i;
		for (int i : B)
			sB += i;
		
		System.out.println(sA == sB ? "YES" : "NO");
	}
}
