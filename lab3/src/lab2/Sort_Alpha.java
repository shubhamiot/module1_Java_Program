package lab2;

import java.util.Arrays;

public class Sort_Alpha {
	public void Uppler_case(String str[])
	{
		Arrays.sort(str);
		for(int i=0;i<str.length/2;i++)
		{
			str[i]=str[i].toUpperCase();
		}
		System.out.println(Arrays.toString(str));
	}
	public static void main(String args[])
	{
		String str[]= {"shubham","mirag","ritest","vishal"};
		Sort_Alpha s=new Sort_Alpha();
		s.Uppler_case(str);
	}
}
