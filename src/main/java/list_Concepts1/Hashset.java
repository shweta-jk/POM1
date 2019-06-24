package list_Concepts1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
		
		ArrayList<String> hs=new ArrayList<String>();
		hs.add("Shweta");
		hs.add("Samir");
		hs.add("Sanya");
		hs.add("Sandy");
		hs.add("Samrat");
		hs.add("Samrat"); 
		hs.add(null);
		
		HashSet<String> hs1=new HashSet<String>(hs);
		hs1.add("Eagle");
		
		for(String str:hs)
		{
			System.out.println(str);
		}
		

	}

}
