package com.niit.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();		//Collection also can be given instead of list but list has much more features than collections
													//using <Integer> is a generics
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(1, 10);   			//1st number is the element at which the number is included in the array....like num[1] and the 2nd number is the value
		//num.add("Logu");		// we can also add string value because list accepts any value
		
		Collections.sort(num);
		//Collections.reverse(num);  		//This will reverse the order. this is possible only after sorting
		Collections.shuffle(num); 			//This can be used to build game
		//Iterator it = num.iterator();
		
		/*for (int i=0;i<=num.size();i++)		//object.size is only given when we don't know the size of the array
		{
			System.out.println(num.get(i));		// we can also give it.next() function 
		}*/
		
		for (Object j : num)		//this is how enhanced for loop is executed with list
		{
			System.out.println(j);
		}
		
		// it.hasNext(); provides the information whether the next value is present or not
		
		/*while(it.hasNext())			//hasnext provides the data up to the last information present 
		{
			System.out.println(it.next());		//.next prints up to the next available data 
		}*/
		
		//if we don't give the while loop then we have to print the it.next() method the number of times the information is present
		
		//System.out.println(num); this will give us the list of entire information present in a listed format or in an array format

	}

}
