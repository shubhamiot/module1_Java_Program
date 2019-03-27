package com;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Collection1 {
	public Map characterCount(char ch[])
	{
		int count =0;
		Map<Character, Integer> m = (Map<Character, Integer>) new HashMap<Character, Integer>();
		for(char c1:ch)
		{
			if(((HashMap<Character, Integer>) m).containsKey(c1))
			{
				count = ((HashMap<Character, Integer>) m).get(c1);
				((HashMap<Character, Integer>) m).put(c1, count+1);
				
			}
			else
				((HashMap<Character, Integer>) m).put(c1, 1);
		}
		return m;
		
	}
	public static void main(String args[])
	{
		char []ch = new char[20];
		String str ="Count characters";
		ch=str.toCharArray();
		Collection1 t = new Collection1();
		System.out.println(t.characterCount(ch));
	}
}
