package com;
interface Demo
{
	public abstract void calculate(int a,int b);
}
public class Lamda_exp1
{
	public static void main(String[] args) 
	{
		Demo d1=(a,b)->
		{
			System.out.println(Math.pow(a,b));
		};
		d1.calculate(3,3);
	}
}
