package list_Concepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// HashMap is a class that implements Map Inteface
		//extends AbstractMap
		//It contains only unique elements
		//stores the values key-value pair
		//it may have one null key and multiple null values
		//it maintains no order(removing a key value pair does not shift the next element to the previous position
		//it is non-sychronized,gives mutiple thread access--not thread safe Fail fast condition(concurrent modification exception) 
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Selenium");
		hm.put(2,"QTP");
		hm.put(3,"TestComplete");
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));//does not give ArrayIndexOutofBound Exception gives null
		
		//iterating through the HashMap for string and Integer
		
		for(Entry<Integer, String> m :hm.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		
		//iterating and using Hashmap for objects
		HashMap<Integer,employee> emp=new HashMap<Integer,employee>();
		employee e1=new employee("Tom",27,"QA");
		employee e2=new employee("Harry",28,"Admin");
		employee e3=new employee("Mary",29,"Dev");
		
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		
		for(Entry<Integer, employee> m :emp.entrySet())
		{
			int key=m.getKey();
			employee e=m.getValue();
			System.out.println(key + "Info");
			
			System.out.println(e.name +"  "+ e.age +"  "+e.dept);
		}
		
		
		

	}

}
