package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/*
 * 
 * 📝 Problem:
Given a list of integers, return a list containing only the unique even numbers sorted in ascending order.

Example:

makefile
Copy
Edit
Input:  [5, 2, 4, 2, 7, 4, 8, 1]
Output: [2, 4, 8]
 * 
 * 
 */
public class prob4 {
public static void main(String[] args) {
	
	//java8();
	
	List<Integer> x1=Arrays.asList(5,2,4,2,7,4,8,1);
	
Set<Integer> z=new HashSet<Integer>(x1);

List<Integer> y=new ArrayList<Integer>();
for(Integer s1:z) {
	if(s1%2==0) {
		y.add(s1);
	}
}

Collections.sort(y);

System.out.println(y);
	
	
}

private static void java8() {
	List<Integer> x1=Arrays.asList(5,2,4,2,7,4,8,1);
	
	
	 List<Integer> list = x1.stream().distinct().filter(a->a%2==0).sorted(Integer::compareTo).toList();
	 
	 System.out.println(list);
}
}
