package javaBasicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class dupnamesarray {

	public static void main(String[] args) {
		
		String names[]= {"Python","Cucumber","RestAPI","BDD","TDD","Kernel","Python","SQL","Cucumber","SQL","BDD","Python"};
		
		
		
		  /*//Method 1)Using Set and HashSet 
		  Set<String> set=new HashSet<String>();
		  for(String nm: names) { if(set.add(nm)==(false))
		  System.out.println("duplicate names is"+nm); }
		 */
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
				storeMap.put(name,count++);
				//System.out.println(name+" "+count);
			
				
		}
		
		Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		for(Entry<String,Integer> entry:entrySet)
			//for(Map.Entry<String, Integer> entry:storeMap.entrySet())
		{
			
			if(entry.getValue()>1)
			{
				System.out.println("duplicate element is :"+entry.getKey());
				
				//System.out.println("duplicate element is :"+entry.getKey()+entry.getValue());
		}
		
		
		
		
	}

	}
	}
