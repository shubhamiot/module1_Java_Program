package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection_Square {
	int num=0;
	public Map Find_Square(int[] arr)
	{
		List<Integer> li=new ArrayList<Integer>();
		for(int i:arr)
		{
			li.add(i);
		}
		Map<Integer, Integer> m1=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			num=i*i;
			m1.put(i,num);
		}
		System.out.println(li);
		return m1;
	}
	public static void main(String args[])
	{
		Collection_Square obj=new Collection_Square();
		int arr[]= {3,4,5,6,6};
		System.out.println(obj.Find_Square(arr));
	}
}
