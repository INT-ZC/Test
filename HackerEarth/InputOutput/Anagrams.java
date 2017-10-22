package HackerEarth.InputOutput;

import java.util.Scanner;

public class Anagrams
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		int t = data.nextInt();
		for (int i = 0; i < t; i++)
		{
			String a = data.next();
			String b = data.next();
			
			String s = new StringBuffer(a).append(b).toString();
			
			int l = s.length();
			
			for (int n = 0; n < s.length()-1; n++)
			{
				//TODO
			}
			System.out.println(l);
		}
	}
}
