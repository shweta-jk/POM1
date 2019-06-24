package list_Concepts1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Testparampassing {
	
	
	public static void param(ArrayList<String> names)
	{
		for(String str:names)
		{
			System.out.println("The names are--"  +str);
			
			
		}
		System.out.println("--------------------"  );
		
		
	}

	
	
	public static void param1(LinkedList<String> names)
	{
		for(String str:names)
		{
			System.out.println("The names are--"  +str);
		}
		
	}
}
