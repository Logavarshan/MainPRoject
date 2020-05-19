package com.niit.practise;

public class Fall {

	public static void main(String[] args) {
		
		int a[][]= {{1,3,2,4,5,6,7,8},{22,33,44},{55,66,88,99,11,22,33,44,55,66,}};
		
		for (int b[] : a)
		{
			for (int c : b) {
				System.out.print(" " +c);
			}
			System.out.println();
		}

	}

}
