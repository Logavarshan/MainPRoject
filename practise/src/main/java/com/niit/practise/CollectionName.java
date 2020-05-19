package com.niit.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	int rollno,marks;
	String names;
	public Student(int rollno, String names, int marks) {
		super();
		this.rollno = rollno;
		this.names = names;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", names=" + names + "]";
	}
	
	public int compareTo(Student s)
	{
		//return names.length()<s.names.length()?1:-1;		//1 is true and -1 is false 
		return marks>s.marks?1:-1;
		
		
	}
	
}

public class CollectionName {

	public static void main(String[] args) {
		
		List<Student> s = new ArrayList<>();
		s.add(new Student(12,"Logavarshan",100));
		s.add(new Student(13,"Logu",98));
		s.add(new Student(14,"Varshan",99));
		s.add(new Student(15,"Hello",90));
		
		Collections.sort(s);
		
		for (Student d : s)				//here student is the user defined return type 
		{
			System.out.println(d);
		}

	}

}
