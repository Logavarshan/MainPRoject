package com.niit.practise;

import java.util.*;


public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		
		map.put("Hi", "Hello");
		map.put("Ji", "Logavarshan");
		map.put("Ti", "You are king");
		
		Set<String> he = map.keySet();
		
		for (String by : he)
		{
			System.out.println(by + " " + map.get(by));
		}
		
		System.out.println(map.get("Ji"));
	
	}

}
