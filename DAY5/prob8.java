package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class prob8 {

	public static void main(String[] args) {
		
		
		
		//[5, 5, 5, 7, 7, 7, 8, 8, 8, 9, 9]

		//3
		
		
		
	//	withoutjava8();
		
		List<Integer> x1=Arrays.asList(5, 5, 5, 7, 7, 7, 8, 8, 8, 9, 9);
		
		 
		Map<Integer, Integer> collect = x1.stream().collect(Collectors.toMap(a->a,a->1,(x,y)->x+y));

	
		System.out.println(collect);
		
		List<Integer> list = collect.values().stream().distinct().sorted(Comparator.reverseOrder()).toList();
	System.out.println(list);
		
		if(list.size()<1) {
		System.out.println(-1);
		}
		else {
		Integer integer = collect.entrySet().stream().filter(x->x.getValue()==list.get(1)).map(x->x.getKey()).max(Integer::compareTo).get();
		
		
		System.out.println(integer);
		}
	
	
	}

	private static void withoutjava8() {
		List<Integer> x1=Arrays.asList(10, 20, 30, 40);
		
		
		
	HashMap<Integer,Integer> x2=new HashMap<Integer, Integer>();
	
	
	
	for(Integer x:x1) {
		
		x2.put(x,x2.getOrDefault(x,0)+1);
	}
	
	//sort it based on values
	
	Set<Entry<Integer, Integer>> entrySet = x2.entrySet();
	

	
	Collection<Integer> values = x2.values();
	
	List<Integer> values1=new ArrayList<Integer>(values);
	
	Collections.sort(values1);
	
	System.out.println(values1);
	
	int a=values1.get(0);
	
	boolean f=true;
	
	for(Integer v1:values1) {
		
		if(a==v1) {
			f=true;
		}
		else {
			f=false;
		}
	}
	
	if(!f) {
		
		
		//find the second max
		int max=0;
		int smax=0;
		for(int i=0;i<values1.size();i++) {
			
			if(values1.get(i)>max) {
				smax=max;
				max=values1.get(i);
				
			}
			
			else if(values1.get(i)>smax && values1.get(i)<max) {
				smax=values1.get(i);
			}
		}
		
		System.out.println("max"+ max);
		System.out.println("smax"+ smax);
		
	
		
		System.out.println("kkkk");
		
		List<Integer> getallkeysmatch=new ArrayList<Integer>();
		
		
		
	
		
		
		for(Entry<Integer,Integer> g1:entrySet) {
			
			if(g1.getValue()==smax) {
				getallkeysmatch.add(g1.getKey());
			}
		}
		
		
	Collections.sort(getallkeysmatch);
	
	
		System.out.println(getallkeysmatch.get(getallkeysmatch.size()-1));
		
		
		
	}
	else {
		System.out.println(-1);
	}
	}
}

