package com.jeeva.jeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob7 {

	public static void main(String[] args) {
		
		List<Integer> x=Arrays.asList(5, 2, 4, 7, 8);
		
//	withoutjava8(x);
		
		
		int sum1=x.stream().mapToInt(x2->x2).filter(a->a%2==0).sum();
		
	System.out.println(sum1);
		
		
	}

	private static void withoutjava8(List<Integer> x) {
		int sum=0;
			
		
		for(Integer x1:x) {
			if(x1%2==0) {
			sum+=x1;	
			}
		}
		
		
		System.out.println(sum);
	}
}
