package lab1;

import java.util.Scanner;

public class Calculate_Difference {
	/**
	
	 *@author SHUBHAM KUMAR GUPTA
	 */
	public int find(int num)
	{
		int sum1=0,sum2=0,square1, square2;
		for(int i=1;i<=num;i++)
		{
			square1=i*i;
			sum1=sum1+square1;
		}
		sum2=num*(num+1)/2;
		square2=sum2*sum2;
		
		return sum1-square2;
	}
	public static void main(String args[])
	{
		Calculate_Difference obj=new Calculate_Difference();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(obj.find(num));
	}
}
