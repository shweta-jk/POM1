package list_Concepts1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrlist {
	
	public static  void main(String[] args) {
		
	
	ArrayList<String> arr=new ArrayList<String>();
	
	arr.add("Selenium");
	arr.add("QTP");
	arr.add("Testing");
	arr.add("SQL");
	
	Testparampassing.param(arr);
	
	
	
	Iterator<String> it= arr.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	ArrayList<Integer> arr2=new ArrayList<Integer>();
	arr2.add(20);
	arr2.add(90);
	arr2.add(60);
	arr2.add(120);
	arr2.add(100);
	Collections.sort(arr2);
	
	System.out.println(arr2);
	
	
	
	
	
	}

	
}
