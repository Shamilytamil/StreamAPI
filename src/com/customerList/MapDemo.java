package com.customerList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.Number.java.Mobile;

public class MapDemo {
	public static void main (String[] args) {
		Mobile apple = new Mobile(512,32,"Apple");
		Mobile samsung = new Mobile(126,8,"Samsung");
		Mobile vivo = new Mobile(64,4,"Vivo");
		Mobile oppo = new Mobile(246,16,"Oppo");
		Set<Integer> newSet = new HashSet<Integer>();
		newSet.add(1);
		newSet.add(6);
		newSet.add(2);
		newSet.add(1);
		newSet.add(3);
		Set<Integer> newSet1 = new TreeSet<Integer>(newSet);
		HashMap<Mobile,Integer> hm = new HashMap<Mobile,Integer>();
		hm.put(apple, 65000);
		hm.put(samsung, 50000);
		hm.put(vivo, 40000);
		hm.put(oppo, 20000);
		Set s = hm.entrySet();
		Set s1 = hm.keySet();
		System.out.println(s1);
		System.out.println(newSet1);
		Set key = hm.keySet();
		for(Map.Entry set : hm.entrySet())
		{ 
			Mobile key1 =(Mobile)set.getKey();
			int memory = key1.getMemory();
			if(memory == 64)
			{
				set.setValue(45000);
			}
			System.out.println(key1.getMemory()+":"+set.getValue());
		}
		
		
	}
}
