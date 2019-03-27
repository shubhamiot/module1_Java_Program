package lab1;

public class Increasing_number 
{
	/**
	 *@author SHUBHAM KUMAR GUPTA
	 */
	public static void main(String args[])
	{
	int num=5629;
	boolean flag=false;
	int first_digit;
	first_digit=num%10;
	num=num/10;
	while(num>0)
	{
		if(first_digit<=num%10)
		{
			flag=true;
			break;
		}
		first_digit=num%10;
	num=num/10;
		
	}
	if(flag)
	{
		System.out.println("not increasing number");
	}
	else
	{
		System.out.println(" increasing number");
	}
	}
}
