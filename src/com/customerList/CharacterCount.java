package com.customerList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterCount {
	public static void main(String[] args) {
	String name ="ShamilyIndra";
	char[] ch = name.toLowerCase().toCharArray();
	HashMap<Character,Integer> countMap = new HashMap<Character,Integer>();
	for(char c:ch) {
		if(countMap.containsKey(c)) {
			countMap.put(c, countMap.get(c)+1);
		}
		else {
			countMap.put(c,1);
		}
	}
	System.out.println(countMap);
	Set<Map.Entry<Character, Integer>> entry = countMap.entrySet();
	for(Map.Entry<Character, Integer> e:entry) {
		if(e.getValue()==1) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}
	}
}
