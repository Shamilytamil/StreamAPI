package com.customerList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerList {
	public static void main(String[] args) {

List<Customer> customerList = new ArrayList<Customer>();
customerList.add(new Customer("E1","Shamily","91021029","Orathanadu","Thanjavur"));
customerList.add(new Customer("E2","Tamil","84791724","Orathanadu","Thanjavur"));
customerList.add(new Customer("E3","Mithra","84791724","Orathanadu","Thanjavur"));
customerList.add(new Customer("E4","Kavi","84791724","Orathanadu","Thanjavur"));
customerList.add(new Customer("E5","Elango","84791724","Kannugudi","Thanjavur"));
customerList.add(new Customer("E6","Surya","84791724","Pudur","Thanjavur"));
customerList.add(new Customer("E7","Suruthi","84791724","GoldenFort","Trichy"));
//Map by groupping
Map<String, List<Customer>> cusAreaMap = customerList.stream().collect(Collectors.groupingBy(Customer::getCusArea));
cusAreaMap.forEach((key,value)->System.out.println("Area :"+key+"--- Value"+value));
//Map by count
Map<String, Long> cusAreaMapCount = customerList.stream().collect(Collectors.groupingBy(Customer::getCusArea,Collectors.mapping(Customer::getCusName, Collectors.counting())));
cusAreaMapCount.forEach((key,value)->System.out.println("Area :"+key+value));
}

}
