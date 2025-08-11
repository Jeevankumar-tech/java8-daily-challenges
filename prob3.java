package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob3 {
public static void main(String[] args) {
	
	List<String> words = Arrays.asList(
		    "apple", "banana", "apple", "orange", "banana", "apple",
		    "kiwi", "banana", "kiwi", "kiwi", "banana", "grape"
		);
		

//	 java8(words);
	
	Map<String,Integer> x1=new HashMap<String,Integer>();
	
	for(String x:words) {
		if(!x1.containsKey(x)) {
			x1.put(x,1);
		}
		else {
			
			Integer valcount = x1.get(x);
			
			x1.put(x,valcount+1);
		}
	}
	
           //System.out.println(x1);


	
	Set<Entry<String, Integer>> entrySet = x1.entrySet();
	
	
	List<Entry<String, Integer>> list = new ArrayList<>(x1.entrySet());
	Comparator<Entry<String,Integer>> x6=(a,b)->a.getValue()-b.getValue(); 	 	
	
	

System.out.println(list);

	for (Entry<String, Integer> e : list) {
	//s	System.out.println("jj");
		if(e.getValue()!=1) {
	    System.out.println(e.getKey() + " = " + e.getValue());
		}
	}
	}



private static void java8(List<String> words) {
	// key -- str val-intefr   key !presernt  1 else value++       ......keys -vlues 1   ..entry  based on values key ni sort chesta
	
Map<String, Integer> collect = words.stream().collect(Collectors.toMap(a->a,a->1,(x,y)->x+y));
	
System.out.println(collect);

List<String> list = collect.entrySet().stream().filter(x->x.getValue()!=1).sorted((o1,o2)->o2.getValue()-o1.getValue()).map(a->a.getKey()).toList();
System.out.println(list);
}
}
