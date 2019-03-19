package com;
//import java.util.*;
public class Smallest {

	public static void main(String[] args) 
	{
		int arr[]= {34,3,45,23,100};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("-----------------------------------------------"+"\n");
		System.out.println("the second highest element in the array is :"+  arr[1]);
		
	}
	

}
