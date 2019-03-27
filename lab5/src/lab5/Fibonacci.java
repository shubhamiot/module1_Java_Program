package lab5;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])
	{
		int num1=0,num2=1,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of numbers");
		int count=sc.nextInt();
		System.out.println(num1+" "+num2);
		for(int i=2;i<count;i++)
		{
			num3=num1+num2;
			System.out.println(" "+num3);
			num1=num2;
			num2=num3;
		}
	}
}
