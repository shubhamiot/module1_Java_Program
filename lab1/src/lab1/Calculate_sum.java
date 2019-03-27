package lab1;

public class Calculate_sum {
	/**
	 *@author SHUBHAM KUMAR GUPTA
	 */
	public int find_sum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
			
		}
		return sum;
	}
	public static void main(String args[])
	{
		Calculate_sum obj=new Calculate_sum();
		System.out.println(obj.find_sum(9));
		System.out.println(obj.find_sum(5));
	}
}
