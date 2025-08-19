package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class prob8 {


public static void main(String[] args) {
	
	
	
	List<Integer> of = new ArrayList<>(List.of(9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6,11));
	// usingbruteforce(of);
//	usingsets_forbetterEfficiency(of);
	
	//will try to implement using java8
	
	
	Set<Integer> x1=new HashSet<Integer>(of);
	
List<Integer> list = x1.stream().filter(a->!x1.contains(a-1)).map(z->{
	
	
	
	List<Integer> seq=new ArrayList<Integer>();
	int cur=z;
	int ls=0;
	while(x1.contains(cur)) {
		seq.add(cur);
		cur++;
	}
	
	return seq;
}).max((s1,s2)->s1.size()-s2.size()).get();

System.out.println(list);
	  
	  
}

private static void usingsets_forbetterEfficiency(List<Integer> of) {
	List<Integer> cslist=new ArrayList<Integer>();
	
	
	 
	  //usinh sets
	  
	Set<Integer> se=new HashSet<Integer>(of);
	
	int cs=0;
	int ls=0;
	List<Integer> lslist=new ArrayList<Integer>();
	
	 
	for(Integer x:se) {
		cslist=new ArrayList<Integer>();
	int cu=x;
	if(!se.contains(x-1)) {
	
		
		while(se.contains(cu)) {
			
			cslist.add(cu);
			cu++;
		}
		
		if(ls<cslist.size()) {
			ls=cslist.size();
			lslist=new ArrayList<Integer>(cslist);
		}
	}
	
	
	
		
		
	}
	
	System.out.println(lslist);
}

private static void usingbruteforce(List<Integer> of) {
	Collections.sort(of);
	  
	  System.out.println(of);
	  
	  int ls=0; int cs=0;
	  
	  List<Integer> cslist=new ArrayList<Integer>();
	  
	  List<Integer> lslist=new ArrayList<Integer>();
	  
	  cslist.add(of.get(0));
	  
	  for(int i=1;i<of.size();i++) {
	  
	  
	  if(of.get(i).equals(of.get(i-1))) { continue; }
	  
	  
	  if(of.get(i)-of.get(i-1)==1) {
	  
	  // cs=of.get(i-1); cslist.add(of.get(i));
	  
	  
	  if(ls<cslist.size()) { ls=cslist.size(); lslist=new
	  ArrayList<Integer>(cslist); }
	  
	  
	  } else { // cs=0; cslist.clear(); cslist.add(of.get(i)); }
	  
	  
	  
	  }
	  
	  
	  System.out.println(lslist);
	  
	  
	  
	 
	
	
	
	
	
	
	
	
	
	
	
}
}}
	/*List<Integer>lstreak=new ArrayList<Integer>();
	
	Set<Integer> x1=new HashSet<Integer>(of);   //dublicates removed
	int cs=0;
int max=0;

	
	for(Integer num:x1) {
		List<Integer>cstreak=new ArrayList<Integer>();
	if(!x1.contains(num-1)) { //true
		
		int cur=num;
		while(x1.contains(cur)) {
			cstreak.add(num);
			cur++;
			
		}
		
		if(cstreak.size()>max) {
			max=cstreak.size();
			x
		
		}
	}
	else {
		
	}
	}
	
	
	
	
}

private static void usingbruteforce_withoutsets() {
	List<Integer> of = new ArrayList<>(List.of(9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6));
	
	Collections.sort(of);
	
	System.out.println(of);
	
	List<Integer> currentseq=new ArrayList<Integer>();
	List<Integer> longestseq=new ArrayList<Integer>();
	
	

	int cstreak=1;
	int lstreak=1;
	
	
	currentseq.add(of.get(0));
	for(int i=1;i<of.size();i++) {
		
		if(of.get(i)-of.get(i-1)==0) {
			
			continue;
		}
		
		if(of.get(i)-of.get(i-1)==1) {
			
			cstreak++;
			currentseq.add(of.get(i));
			
			if(cstreak>lstreak) {
				lstreak=cstreak;
				longestseq=new ArrayList<Integer>(currentseq);
			}
			
		}
		
		else {
			cstreak=1;
			currentseq.clear();
			currentseq.add(of.get(i));
		}
		
		
		
		
	}
	
	System.out.println(longestseq);
	
	System.out.println(lstreak+"lstreadk");
}
}
*/