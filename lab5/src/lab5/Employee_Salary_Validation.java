package lab5;

import java.util.Scanner;

public class Employee_Salary_Validation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of employee");
		double salary=sc.nextDouble();
		try
		{
			if(salary<3000)
			{
				throw new Exception("Exception occured salary of employee is lower than 3000");
			}
			else
			{
				System.out.println("Exception must be greate than 3000");
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
