package list_Concepts;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistc {

	public static void main(String[] args) {
		
		LinkedList<String> lnk=new LinkedList<String>();
		
		lnk.add("test");
		lnk.add("QA");
		lnk.add("Automation");
		lnk.add("Java");
		
		System.out.println("content of linked list"+lnk);
		lnk.addFirst("Shweta");
		
		lnk.addLast("Kulkarni");
		lnk.set(1,"Python");
		System.out.println("content of linked list after mod"+lnk);
		
		
		//using for loop
		System.out.println("for loop ***************");
		for(int i=0;i<lnk.size();i++)
		{
			System.out.println(lnk.get(i));
		}
		
		//using advanced for loop--for each loop
		System.out.println("for each loop ***************");
		for(String str :lnk)
		{
			System.out.println(str);
		}
		
		//using iterator
		System.out.println("iterator***************");
		Iterator <String> strn=lnk.iterator();
		while(strn.hasNext())
		{
			System.out.println(strn.next());
		}
		
		//using while loop
		System.out.println("whileloop ***************");
		int num=0;
		while(lnk.size()>num)
		{
			System.out.println(lnk.get(num));
			num++;
		}
		
	}

}
