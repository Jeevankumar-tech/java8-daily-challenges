package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class prob6 {

	
	public static void main(String[] args) {
		
		
		
		List<String> words = Arrays.asList("bat", "tab", "eat", "tea", "tan", "nat");

		
		withoutjava8(words);
		
		
		 
	Map<String, List<String>> collect = words.stream().collect(Collectors.groupingBy(
			
			w->{
				
				int a[]=new int[26];
				
				for(char ch:w.toCharArray()) {
					a[ch-'a']++;
					
				}
				
				return Arrays.toString(a);
			}
			
			));
	
	System.out.println(collect.values());
	
	
	}

	private static void withoutjava8(List<String> words) {
		HashMap<String,List<String>> a=new HashMap<String, List<String>>();
		
		
		
		for(int i=0;i<words.size();i++) {
			Integer[] charCount=new Integer[26];
			 Arrays.fill(charCount, 0);
			for(int j=0;j<words.get(i).length();j++) {
				int x=(int)(words.get(i).charAt(j));
				
				charCount[x - 'a'] = charCount[x - 'a'] + 1;
			}
			
			  String key = Arrays.toString(charCount);
			if(!a.containsKey(key)) {
				 List<String> newList = new ArrayList<>();
				    newList.add(words.get(i));
				    a.put(key, newList);
			}
			else {
				a.get(key).add(words.get(i));
			}
			
		}
		
		System.out.println(a.values());
	}
}
