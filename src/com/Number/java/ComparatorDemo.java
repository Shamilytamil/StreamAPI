package com.Number.java;

import java.util.Comparator;

public class ComparatorDemo implements Comparator{

	@Override
	public int compare(Object o1,Object o2) {
		// TODO Auto-generated method stub
		
		Mobile m1 = (Mobile)o1;
		Mobile m2 = (Mobile)o2;
		if(m2.memory>m1.memory)
			return 1;
		else if (m2.memory<m1.memory)
			return -1;
		else
			return 0;
	}

}
