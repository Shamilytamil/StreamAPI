package com.customerList;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
public class Test {
	public static void main (String[] args) {
		
	
		CustomerList c1 = new CustomerList();
		c1.setCusId("E1");
		c1.setCusName("Shamily");
		c1.setCusPh("91021029");
		c1.setCusArea("Orathanadu");
		c1.setCusDis("Thanjavur");
		CustomerList c2 = new CustomerList();
		c2.setCusId("E2");
		c2.setCusName("Tamil");
		c2.setCusPh("84791724");
		c2.setCusArea("Orathanadu");
		c2.setCusDis("Thanjavur");
		CustomerList c3 = new CustomerList();
		c3.setCusId("E3");
		c3.setCusName("Mithra");
		c3.setCusPh("84791722");
		c3.setCusArea("Orathanadu");
		c3.setCusDis("Thanjavur");
		CustomerList c4 = new CustomerList();
		c4.setCusId("E4");
		c4.setCusName("kavi");
		c4.setCusPh("84791772");
		c4.setCusArea("Orathanadu");
		c4.setCusDis("Thanjavur");
		CustomerList c5 = new CustomerList();
		c5.setCusId("E5");
		c5.setCusName("elango"); 
		c5.setCusPh("84745772");
		c5.setCusArea("Kannugudi");
		c5.setCusDis("Thanjavur");
		CustomerList c6 = new CustomerList();
		c6.setCusId("E6");
		c6.setCusName("Rani");
		c6.setCusPh("85745772");
		c6.setCusArea("Kannugudi");
		c6.setCusDis("Thanjavur");
		CustomerList c7 = new CustomerList();
		c7.setCusId("E7");
		c7.setCusName("Surya");
		c7.setCusPh("85705772");
		c7.setCusArea("Pudur");
		c7.setCusDis("Thanjavur");
		List<CustomerList> cs = new ArrayList<>();
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		cs.add(c4);
		cs.add(c5);
		cs.add(c6);
		cs.add(c7);
	
		/*HashMap<String,Long> map = cs.stream().collect(Collectors.groupingBy(CustomerList ->CustomerList.getCusArea(),HashMap::new,Collectors.mapping(CustomerList::getCusName, Collectors.counting())));
		System.out.println(map);
		List<Entry<String,Long>> list = new LinkedList<Entry<String,Long>>(map.entrySet());
		Collections.sort(list,new Comparator<Entry<String,Long>>(){
			public int compare(Entry<String, Long>o1,Entry<String, Long>o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		for(Entry<String,Long> item: list) {
			System.out.println(item);
		
		}*/
		
	Map<String,Integer> map = new HashMap<String,Integer>();
	int size = cs.size();
	int num=0;
	for(int i=0;i<=size;i++)
	{
		if(((CustomerList) cs).getCusArea()=="Orathanadu")
		{
		num=num+1;
		map.put("Orathanadu", num);
		
		}
		else if(((CustomerList) cs).getCusArea()=="Kannugudi")
		{
		num=num+1;
		map.put("Kannugudi", num);
		}
		else if(((CustomerList) cs).getCusArea()=="Pudur")
		{
		num=num+1;
		map.put("Pudur", num);
		}
		else {
			
			System.out.println("No Area Match");
		}
		
	}
	
		for(Map.Entry<String,Integer> list: map.entrySet()) 
		{
			System.out.format("Key: %s, Value: %d%n",list.getKey(),list.getValue());
		}
	
		
		
		}
	}																																																					
	


