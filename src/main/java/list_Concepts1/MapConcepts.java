package list_Concepts1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapConcepts {

	public static void main(String[] args) {
		
		 Map<Integer,String> map=new Hashtable<Integer,String>();  
		 
		 
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		 
		  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){ 
			  System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
		
		
		
		
	}


