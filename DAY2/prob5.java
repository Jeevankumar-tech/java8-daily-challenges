package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class prob5 {

	public static void main(String[] args) {
		
		
		
		  List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		  
		 
		  
		 // usingtradinalway(words);
		  
		  
		  //java 8
		  
		Map<String, ArrayList<String>> collect = words.stream().collect(Collectors.groupingBy(
				
		s->{
			 char[] chars = s.toCharArray();
             Arrays.sort(chars);
            // System.out.println(chars);
             return new String(chars);
			
		
		
		
		},		Collectors.toCollection(ArrayList::new)

				 
	));
		
		 Collection<List<String>> values = words.stream()
         .collect(Collectors.groupingBy(
             word -> word.chars()
                          .sorted()
                          .mapToObj(c -> String.valueOf((char) c))
                          .collect(Collectors.joining())
         ))
         .values();
 
		
		
		System.out.println(collect.values());
		
		System.out.println(values);
		
	}


	private static void usingtradinalway(List<String> words) {
		HashMap<String,List<String>> x=new HashMap<>();
		  //
	
		  for(String wo:words) {
			  String s1=getsorted(wo); //ate
			 
			  /*   this is old way
			  if(x.containsKey(s1)) {
				x.get(s1).add(wo);
			  }
			  else {
				  ArrayList<String> ve=new ArrayList<String>();
				  
				  
				  ve.add(wo);
				  
				  x.put(s1,ve);
			  }
			  
			  
			  */
			  
			 List<String> computeIfAbsent = x.computeIfAbsent(s1,a->new ArrayList<>());  
			 
			
			  
	 computeIfAbsent.add(wo);
		  }
		  
		 System.out.println(x.values());
	}
	
	
	public static String getsorted(String w) {
		
		
		//List<char[]> x=Arrays.asList(w.toCharArray());
		
		char[] s1 = w.toCharArray();
		
		Arrays.sort(s1);
		
	//	System.out.println(s1);
		
		
		
	String s2=String.valueOf(s1);
	
	return s2;
		
		

		
		
	}
}
