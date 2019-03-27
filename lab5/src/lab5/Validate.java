package lab5;

import java.util.Scanner;

public class Validate {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first and second name of emplpyee");
		String first_name=sc.nextLine();
		String second_name=sc.nextLine();
		try
		{
			if(first_name.isEmpty() || second_name.isEmpty())
			{
				throw new NullPointerException();
			}
			else
			{
				System.out.println(first_name+" "+second_name);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
	}

}
