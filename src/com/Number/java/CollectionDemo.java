package com.Number.java;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile apple = new Mobile(512,32,"Apple");
		Mobile samsung = new Mobile(126,8,"Samsung");
		Mobile vivo = new Mobile(64,4,"Vivo");
		Mobile oppo = new Mobile(246,16,"Oppo");
		
		ArrayList<Mobile> al = new ArrayList<Mobile>();
		al.add(apple);
		al.add(samsung);
		al.add(vivo);
		al.add(oppo);
		al.add(apple);
		al.add(samsung);
	
	
		System.out.println("Before Sorting"+al);
		ComparatorDemo cd = new ComparatorDemo();
		Collections.sort(al, cd);
		System.out.println("After Sorting using memory "+al);
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
			
		}
		
		HashSet hs = new HashSet();
		hs.add(apple);
		hs.add(samsung);
		hs.add(vivo);
		
		for(Object o : hs)
		{
			System.out.println(o);
			
		}
		
		System.out.println("Execution of Linked Hash Set" );
		LinkedHashSet lhs = new LinkedHashSet(al);	
		System.out.println(lhs);
		
	}
	
	
	

}
