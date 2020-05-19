package com.niit.practise;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> q = new TreeSet<>();		// if you give hashset method and if you give higher values then java follows an algorithm in which the nearest number fetched will be printed 1st so that the reason it will not be printed the desired order in which we are printing 
		
		System.out.println(q.add(299));
		System.out.println(q.add(382));
		System.out.println(q.add(213));
		System.out.println(q.add(136));
		System.out.println(q.add(213));	//this is getting false because set has only unique values 
		
		//System.out.println(q);		//if you print q then you'll be getting the output in the array format
		
		for (int i : q)
		{
			System.out.println(i);
		}
		
		
		
//		Iterator<Integer> it = q.iterator();
//		for (int i=0;i<=q.size();i++)
//		{
//			System.out.println(it.next());
//		}
		
	}

}
