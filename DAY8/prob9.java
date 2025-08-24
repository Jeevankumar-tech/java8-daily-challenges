package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class prob9 {

	public static void main(String[] args) {
		
		
		
	List<String> asList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
	
	usingeffiecientmethod(asList);
	
	Map<String, List<String>> collect = asList.stream().collect(Collectors.groupingBy(
			
			
			
			(x)->{
				
				int[]a=new int[26];
				
				
				
					
				
					
					char[] charArray = x.toCharArray();
					
					for(char z:charArray) {
						
						a[z-97]++;
					}
				
				
					return Arrays.toString(a);
				
				
			}
			
			
			
			));
	
	System.out.println(collect.values());

	
	
	
	
	}

	private static void usingeffiecientmethod(List<String> asList) {
		Map<String,List<String>> z1=new HashMap<String, List<String>>();
		//List<String> x=new ArrayList<String>();
		// usingbruteforce(asList);
		
		
		int[]a=new int[26];
		
		
		for(String x1:asList) {
			
		a=new int[26];
			
			char[] charArray = x1.toCharArray();
			
			for(char z:charArray) {
				
				a[z-97]++;
			}
		
		
			String string = Arrays.toString(a);
			
		
			z1.computeIfAbsent(string,s->new ArrayList()).add(x1);
			
		
		}
		
		System.out.println(z1.values());
	}

	private static void usingbruteforce(List<String> asList) {
		Map<String,List<String>> map=new HashMap<String, List<String>>();

		for(String x1:asList) {
			//System.out.println("j");
			char[] charArray = x1.toCharArray();
			
			Arrays.sort(charArray);
		String s=String.valueOf(charArray);
//	x.add(s);
		
		map.computeIfAbsent(s,k->new ArrayList<>()).add(x1);
		
		
		}

System.out.println(map);
	}
}
