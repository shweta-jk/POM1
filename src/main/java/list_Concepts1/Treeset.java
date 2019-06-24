package list_Concepts1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {
	/*
	 * private int x, y; public Sortedset(int x, int y) { this.x = x; this.y = y; }
	 */
	/*
	 * public int getX() { return x; } public int getY() { return y; }
	 */
	
	// Custom toString() Method.
	
	/*
	 * public String toString() { return x + " " + y; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Sortedset point = new Sortedset(20, 10);
	 * 
	 * System.out.println(point); String s = point + " testing";
	 * System.out.println(s); }
	 */
	
	//Sorted set cannot have duplicate elements
	//A NullPointerException is thrown if an attempt is made to use a null object and null is not allowed in the set.
	
	
	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<String>(); 

	      // Add elements to the set
	      set.add("b");
	      set.add("c");
	      set.add("a");
	      set.add("a");


	      // Iterating over the elements in the set
	      Iterator it = set.iterator();

	      while (it.hasNext()) {
	         // Get element
	         //Object element = it.next();
	         System.out.println(it.next());
		
	      }
	      
	      for(String str: set) 
	      {
	    	  System.out.println(str);
	      }
		
		
	
	}
}	      


