package com.customerList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Tamil Shamily";
		char[] ch =s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c : ch)
		{
		
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
			
		
		}
		System.out.println(hm.keySet());		
	}

}
