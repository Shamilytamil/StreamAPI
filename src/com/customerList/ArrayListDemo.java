package com.customerList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Tamil");
		al.add("Shamily");
		al.add("Mithu");
		al.add("Kavi");
		System.out.println(al);
		al.add(1, "Kaviya");
		System.out.println("After adding Kaviya Sri"+al);
		System.out.println(al.get(4));
		ArrayList a1 = new ArrayList();
		a1.add("Rani");
		a1.addAll(0, al);
		System.out.println(a1);
		System.out.println(a1.contains("Tamil"));
		System.out.println(a1.set(3, "Elango"));
		System.out.println(a1);
	
		List a2 = a1.subList(1, 3);
		System.out.println(a2);
	
	}

}
