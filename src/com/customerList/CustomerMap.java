
package com.customerList;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
public class CustomerMap {
	public static void main (String[] args) {
		

		Customer c1 = new Customer();
		c1.setCusId("E1");
		c1.setCusName("Shamily");
		c1.setCusPh("91021029");
		c1.setCusArea("Orathanadu");
		c1.setCusDis("Thanjavur");
		Customer c2 = new Customer();
		c2.setCusId("E2");
		c2.setCusName("Tamil");
		c2.setCusPh("84791724");
		c2.setCusArea("Orathanadu");
		c2.setCusDis("Thanjavur");
		Customer c3 = new Customer();
		c3.setCusId("E3");
		c3.setCusName("Mithra");
		c3.setCusPh("84791722");
		c3.setCusArea("Orathanadu");
		c3.setCusDis("Thanjavur");
		Customer c4 = new Customer();
		c4.setCusId("E4");
		c4.setCusName("kavi");
		c4.setCusPh("84791772");
		c4.setCusArea("Orathanadu");
		c4.setCusDis("Thanjavur");
		Customer c5 = new Customer();
		c5.setCusId("E5");
		c5.setCusName("elango"); 
		c5.setCusPh("84745772");
		c5.setCusArea("Kannugudi");
		c5.setCusDis("Thanjavur");
		Customer c6 = new Customer();
		c6.setCusId("E6");
		c6.setCusName("Rani");
		c6.setCusPh("85745772");
		c6.setCusArea("Kannugudi");
		c6.setCusDis("Thanjavur");
		Customer c7 = new Customer();
		c7.setCusId("E7");
		c7.setCusName("Surya");
		c7.setCusPh("85705772");
		c7.setCusArea("Pudur");
		c7.setCusDis("Thanjavur");
		Customer c8 = new Customer();
		c8.setCusId("E8");
		c8.setCusName("Suruthi");
		c8.setCusPh("98526341");
		c8.setCusArea("GoldenFort");
		c8.setCusDis("Trichy");
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		customerList.add(c6);
		customerList.add(c7);
		customerList.add(c8);
	
		
		Map<String,Map<String,Integer>> disWiseMap = new HashMap<String,Map<String,Integer>>();
		Map<String, Integer> areaWiseMap;
		
		for(Customer customer : customerList) {
			areaWiseMap = disWiseMap.get(customer.getCusDis());
			if(null == areaWiseMap)
		{
		areaWiseMap = new HashMap<>();
		areaWiseMap.put(customer.getCusArea(), 1);
		}
		else 
		{
		Integer areaWiseCount = areaWiseMap.get(customer.getCusArea());
		if(null == areaWiseCount) {
			areaWiseCount = 1;
		}
		else {
			areaWiseCount++;
		}
		areaWiseMap.put(customer.getCusArea(), areaWiseCount);
		}
			disWiseMap.put(customer.getCusDis(), areaWiseMap);
		}
		System.out.println("Distric Wise Customer List");
		for(String dist : disWiseMap.keySet())
		{
			System.out.println(dist+disWiseMap.get(dist));
		}
	}

}
