package lab1;

import java.util.Scanner;

public class Power {
	private static boolean Power_two(int number)
	{
		if(number%2!=0) {
			return false;
		}
		else {
			for(int i=0;i<=number;i++)
			{
				if(Math.pow((2,i)==number) 
						return true;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(Power_two(number)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
