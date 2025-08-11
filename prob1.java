package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 
 * 
 Problem:
You are given a list of strings. Remove all empty strings from the list.

Input Example:

java
Copy
Edit
List<String> input = Arrays.asList("apple", "", "banana", "", "cherry");
Expected Output:

java
Copy
Edit
["apple", "banana", "cherry"]

 * 
 * 
 */
public class prob1 {

	public static void main(String[] args) {
		
		
		usinglists();
		
		
		List<String> input = Arrays.asList("apple", "", "banana", "", "cherry");
		
		List<String> i1=new ArrayList<String>();
		
		/*
		 * for(int i=0;i<input.size();i++) { if(!input.get(i).isEmpty()) {
		 * i1.add(input.get(i)); } }
		 */
		
		
		for(String x:input) {
			if(!x.isEmpty()) {
				i1.add(x);
			}
		}
		System.out.println(i1);
	
	
	}

	private static void usinglists() {
		List<String> input = Arrays.asList("apple", "", "banana", "", "cherry");
		
		
	List<String> list = input.stream().filter(a->a.length()>0).toList();
	
	System.out.println(list);
	}
	
	
	
	
	
	
	}
