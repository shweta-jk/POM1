package list_Concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {

	public static  void main(String[] args) {
		
		/*dynamic array--ArrayList
		 * It can contain duplicate values/elements
		 * maintains insertion order
		 * its not synchronized,quite slow(its not thread safe wrt multithreading concept)
		 */
		
		/* non generic vs generic
		 * 
		 */
		
		ArrayList ar=new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		
		ArrayList ar2=new ArrayList();
		ar2.add(30);
		ar2.add("sam");
		ar2.add("wonderla");
		ar.addAll(ar2);
		//System.out.println(ar);
		
		/*ar.removeAll(ar2);
		System.out.println(ar);*/
		
		ar2.retainAll(ar);
		System.out.println(ar2);
		
		employee e1=new employee("Shweta",25,"Finance");
		employee e2=new employee("Sanya",26,"HR");
		employee e3=new employee("Santa",27,"Marketing");
		
		ArrayList<employee> arE=new ArrayList<employee>();
		arE.add(e1);
		arE.add(e2);
		arE.add(e3);
		System.out.println(arE);
		Iterator<employee> it=arE.iterator();
		while(it.hasNext()) {
			employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		

	ArrayList num=new ArrayList();
	
	num.add(10);
	num.add(20);
	num.add(30);
	num.add(40);
	num.add(50);
	num.set(3,80);
	
	passarraylist(num);
	
	ArrayList<String> strarray=new ArrayList<String>();
	
	strarray.add("amanda");
	strarray.add("sandy");
	strarray.add("nick");
	strarray.add("Jules");
	strarray.add("Watts");
	
	passstrarray(strarray);
	
	employee emp1=new employee("Sanda",35,"Qualitest");
	employee emp2=new employee("Panda",38,"QTP");
	employee emp3=new employee("maanda",36,"AWS");
	employee emp4=new employee("donna",39,"Azure");
	employee emp5=new employee("propaganda",40,"Cisco");
	
	ArrayList<employee> labour=new ArrayList<employee>();
	labour.add(emp1);
	labour.add(emp2);
	labour.add(emp3);
	labour.add(emp4);
	labour.add(emp5);
	
	passemp(labour);
	
	
	}
	
	
	public static void passarraylist(ArrayList num)
	{
		System.out.println(num);
	}

	
	public static void passstrarray(ArrayList strarray)
	{
		System.out.println(strarray);
	}
	
	public static void passemp(ArrayList<employee> lab)
	{	
		Iterator<employee> it=lab.iterator();
		while(it.hasNext())
		{
			employee l=it.next();
			System.out.println(l.name+" "+l.age+" "+l.dept);
			
		}
		
	}
	
}
