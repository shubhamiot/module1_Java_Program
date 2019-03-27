package lab6;

import java.util.Scanner;

public class Positive_string {
		public boolean find_positive(String str)
		{
			int count=0;
			int len=str.length();
			char[] arr=str.toCharArray();
			boolean flag=false;
			
			for(int i=0;i<len-1;i++)
			{
				if((int)arr[i]<(int)arr[i+1])
				{
					count++;
				}
				else
				{
					flag=true;
				}
			}
			if(count==len-1)
			{
				return true;
			}
			else
				if(flag)
				{
					return false;	
				}
			return false;
			
		}
		public static void main(String args[])
		{
			Positive_string obj=new Positive_string();
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.println(obj.find_positive(str));
		}
}
