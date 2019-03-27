package lab4;

import java.util.Scanner;

public class Sum_Cube {
	void calculate(int num)
	{
		int sum=0,init=0;
		for(int i=0;i<=num;i++)
		{
			init=i*i*i;
			sum=sum+init;
		}
		System.out.println("the sum is:"+sum);
	}
	public static void main(String args[])
	{
		Sum_Cube obj=new Sum_Cube();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		obj.calculate(num);
	}
	
}
