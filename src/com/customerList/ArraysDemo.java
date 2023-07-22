package com.customerList;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
	public static void main(String[] args) {
		
		int[] arr1 = {10,19,3,70,15};
		int[] arr2 = {12,14,15,89,94};
		String[] name = {"Tamil","Sham","Mithu","Kavi"};
		
		Arrays.sort(arr1);
		
		for (int i : arr1) {
			System.out.println(i);
		}
		
		Comparator comp = new ComparatorDemo();
		Arrays.sort(name, comp);
		for(String s : name) {
			System.out.println(s);
		}
		
	boolean cond = Arrays.equals(arr1, arr2);	
	System.out.println(cond);
		
		
		 
	}
	

}
