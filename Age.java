package com;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of a person");
		int age=sc.nextInt();
		try
		{
			if(age<18)
			{
				System.out.println(age);
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
