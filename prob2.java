package com.jeeva.jeight;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class person{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	
}

class namecomparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}
public class prob2 {

	public static void main(String[] args) {
		
		
		List<person> people = Arrays.asList(
			    new person("Alice", 17),
			    new person("Bob", 20),
			    new person("Charlie", 15),
			    new person("David", 22)
			);

		
		 usingjava8(people);
		 List<String> x=new ArrayList<String>();
		 
		 for(person p1:people) {
			 if(p1.getAge()>18) {
				x.add(p1.getName().toUpperCase()); 
			 }
		 }
		 
		 Comparator<String> x1=(q1,q2)->{
			return q1.compareTo(q2); 
		 };
		Collections.sort(x,x1);
		// System.out.println(x);
		
	}

	private static void usingjava8(List<person> people) {
		List<String> list = people.stream().filter(a->a.getAge()>18).map(s->s.getName().toUpperCase()).sorted((q1,q2)->{
			
			
			return q1.compareTo(q2);
		}).toList();
	//	 System.out.println(list);
		 
		 List<String> lis2 = people.stream().filter(a->a.getAge()>18).map(s->s.getName().toUpperCase()).sorted(String::compareTo).toList();
		 
		 System.out.println(lis2);
	}
}
