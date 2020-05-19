package com.niit.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		
		List <Integer> w = new ArrayList<>();
		w.add(321);
		w.add(449);
		w.add(198);
		w.add(677);
		w.add(763);
		
		Comparator<Integer> c = (i,j) ->		//We can also remove the return type integer because we are using lambda expression
					{
						//if (i%10>j%10)			//1//giving this condition will sort the elements on the basis of one's digit and sort them in an ascending order
						
							/*return 1;
							else 
								return -1;*/
							return i%10>j%10?1:-1;		//2//instead of using if else statement we can use ternary operator
						
					};
				
		Collections.sort(w, c);			//We can also use the return code in place of "c" and and remove the comparator operator code line and paste the return statement code instead of "c"  
		
		for (int r : w)		//instead of "c" we can write (i,j)->i%10>j%10?1:-1
		{
			System.out.println(w.get(r));
		}
	}

}
