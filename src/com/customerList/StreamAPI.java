package com.customerList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,5,8,9,34,11);
		//list.forEach(i->System.out.println(i)); 
		List<Integer> evenList = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		evenList.forEach(i->System.out.println(i));
		List<Integer> list1 =Arrays.asList(3,4);
		List<Integer> list2 =Arrays.asList(5,6);
		List<List<Integer>> collectList = Arrays.asList(list,list1,list2);
		//flatmap
		List<Integer> finalList = collectList.stream().flatMap(x->x.stream().map(n->n*5)).collect(Collectors.toList());
		System.out.println(finalList);
		//distinct count
		List<String> vehicles = Arrays.asList("bus","car","train","bus","car","flight","train","cycle");
		long i = vehicles.stream().distinct().count();
		System.out.println(i);
		//limit
		List<String> newV = vehicles.stream().limit(4).collect(Collectors.toList());
		newV.forEach(x->System.out.println(x));
		//Min
		Optional<Integer> minValue = list.stream().min((x,y)->{return x.compareTo(y);});
		System.out.println(minValue.get());
		//Max
		Optional<Integer> maxValue = list.stream().max((x,y)->{return x.compareTo(y);});
		System.out.println(maxValue.get());
		//reduce
		Integer reduce = list.stream()
						.filter(n->n%2==0)
						.map(n->n+2)
						.reduce(1,(c,e)->c*e);
		System.out.println(reduce);
		//sorted ASC
		list.stream().sorted().forEach(y->System.out.println(y));
		//sorted reverse DSC
		list.stream().sorted(Comparator.reverseOrder()).forEach(y->System.out.println(y));
		//sorted by length
		vehicles.stream()
		.sorted(Comparator.comparingInt(String::length))
		.forEach(System.out::println);
		
	}
	

}
