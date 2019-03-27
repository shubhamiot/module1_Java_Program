package lab6;

import java.util.StringTokenizer;

public class Token_sum {
	public static void main(String args[])
	{
		StringTokenizer st=new StringTokenizer("2 3 4 5");
		System.out.println(st.countTokens());
		long sum=0;
		while(st.hasMoreTokens())
		{
			long i=Long.parseLong(st.nextToken());
			System.out.println(i+"\n");
			sum=sum+i;
		}
		System.out.println("the sum is "+sum);
	}
}
