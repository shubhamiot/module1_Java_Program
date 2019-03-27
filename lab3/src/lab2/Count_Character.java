package lab2;

import java.util.Scanner;

public class Count_Character {
	public static void main(String args[])
	{
		String str="shuuuuubhhhhsssddddddd";
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(c==str.charAt(i))
			{
				++count;
			}
		}
	}
}
