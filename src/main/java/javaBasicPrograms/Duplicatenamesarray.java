package javaBasicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicatenamesarray {

	public static void main(String[] args) {
		
		String names[]= {"Python","Cucumber","RestAPI","BDD","TDD","Kernel","Python","SQL","Cucumber","SQL","BDD","Python"};
		
		
		
		  //Method 1)Using Set and HashSet 
		  Set<String> set=new HashSet<String>();
		  for(String nm: names) { if(set.add(nm)==(false))
		  System.out.println("duplicate names is"+nm); }
		 
		//Method 2>Using HashMap
		Map<String,Integer> storeMap=new HashMap<String,Integer>();
		for(String name:names)
		{
			//System.out.println(storeMap.get(name));
			Integer count=storeMap.get(name);
			if(count==null)
			{
				storeMap.put(name,1);
				//System.out.println(storeMap.put(name,1));
			
			}else
				System.out.println(storeMap.put(name,++count));
			
				
		}
		
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		for(Entry<String,Integer> entry:entrySet)
		{
			
			if(entry.getValue()>1)
				System.out.println("duplicate element is :"+entry.getKey());
				
				//System.out.println("duplicate element is :"+entry.getKey()+entry.getValue());
		}
		
		
		
		
		
	}

}
