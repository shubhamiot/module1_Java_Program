package lab5;

import java.util.Scanner;

public class Traffic {
	public static void main(String args[])
	{
		System.out.println("press 1 for red light");
		System.out.println("press 2 foryellow light");
		System.out.println("press 3 for green light");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num)
		{
			case 1:
			System.out.println("stop");
			break;
			
			case 2:
			System.out.println("ready");
			break;
			
			case 3:
			System.out.println("go");
			break;
			
			default:
			System.out.println("wrong choice");
			
		}
	}
}
