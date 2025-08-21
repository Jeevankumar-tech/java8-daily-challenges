package com.jeeva.jeight;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class prob9 {

	public static void main(String[] args) {
		
		//swiss
		
		String s="swiss";
		
		
		
		char[]ch=s.toCharArray();
		
	Map<Character, Long> collect = s.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(z->z,()->new LinkedHashMap<>(),Collectors.counting()));

Character orElse = collect.entrySet().stream().filter(a->a.getValue()==1).map(x->x.getKey()).findFirst().orElse(null);

if(orElse!=null) {
	System.out.println(orElse);
}
else {
	System.out.println(-1);
}
		
	}

	private static void withoutjava8(String s) {
		Map<Character,Integer> x1=new LinkedHashMap<Character,Integer>();
		
		
		char[] charArray = s.toCharArray();
		
		//uy
		
		for(Character z1:charArray) {
			
		x1.put(z1,x1.getOrDefault(z1,0)+1);	
		}
		
		System.out.println(x1);
		
		Set<Entry<Character, Integer>> entrySet = x1.entrySet();
	
		int count=0;	
		for(Entry<Character,Integer> d:entrySet) {
			
			if(d.getValue()==1) {
				System.out.println(d.getKey());
				count++;
				break;
			}
		}
		if(count==0) {
		System.out.println(-1);	
		}
	}
}
