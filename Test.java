package com;
import java.util.*;
import java.util.Scanner;
public class Test {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter red or yellow or green");
		String op=sc.nextLine();
		if(op=="red")
		{
			System.out.println("stop");
		}
		else if(op=="green")
		{
			System.out.println("go");
		}
		else if(op=="yellow")
		{
			System.out.println("ready");
		}
		else 
		{
			System.out.println("invalid input");
		}
	}
}
