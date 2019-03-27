package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

public class Collection2 {
	Integer id;
	String name;
	public List ask_Values(HashMap<Integer, String> m )
	{
		TreeMap<Integer,String> t = new TreeMap<Integer,String>();
		t.putAll(m);
		Collection<String> c=t.values();
		List<String> li = new ArrayList<String>();
		li.addAll(c);
		return li;
		
	}
	public static void main(String args[])
	{
		Map <Integer, String> m = new HashMap<Integer, String>();
		m.put(5, "Shubham");
		m.put(3, "Rohit");
		m.put(2, "Vishal");
		m.put(1, "harsh");
		
		Collection1 obj= new Collection1();
		System.out.println(obj.ask_Values((HashMap)m));
	}
}
