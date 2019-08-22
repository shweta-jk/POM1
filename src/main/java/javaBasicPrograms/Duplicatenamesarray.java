package javaBasicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.primitives.Chars;

public class Duplicatenamesarray {

	public static void main(String[] args) {
		
		String names[]= {"Python","Cucumber","RestAPI","BDD","TDD","Kernel","Python","SQL","Cucumber","SQL","BDD","Python"};
		
		longestSubstring("Javaconceptoftheday");
		repandnonrepchar("Javaconceptoftheday");
		
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
				storeMap.put(name,++count);
				//System.out.println(name+" "+count);
			
				
		}
		
		/*Set<Entry<String,Integer>> entrySet=storeMap.entrySet();
		for(Entry<String,Integer> entry:entrySet)*/
			for(Entry<String, Integer> entry:storeMap.entrySet())
		{
			
			if(entry.getValue()>1)
			{
				//System.out.println("duplicate element is :"+entry.getKey());
				
				System.out.println("duplicate element is :"+entry.getKey()+entry.getValue());
		}
		
		
		
		
		
	}

}
	
	/*The longest substring of a string*/
	static void longestSubstring(String inputString)
    {
        //Convert inputString to charArray
         
        char[] charArray = inputString.toCharArray();
        
        int longestsubstringlen=0;
        String longsubstring=null;
        
        Map<Character,Integer> charmap=new LinkedHashMap<Character,Integer>();
        
        for(int i=0;i<charArray.length;i++)
        {	
        	char c=charArray[i];
        	if(!charmap.containsKey(c))
        		{charmap.put(c, i);
        		
        		}
        	
        	else
        	{
        		i=charmap.get(c);
        		charmap.clear();
        	}
        
        if(charmap.size()>longestsubstringlen)
        	{
        		longestsubstringlen=charmap.size();
        		longsubstring=charmap.keySet().toString();
        	
        	}
        }
        System.out.println(longsubstring+" "+longestsubstringlen);
    }
         
        //Initialization
         
        
	
	/*first repeated and non repeated character in a string*/
	
	public static void repandnonrepchar(String str)
	{
		char[] arrays1=str.toCharArray();
		Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		
		for(char c:arrays1)
		{
				if(hm.containsKey(c))
					hm.put(c, hm.get(c)+1);
				else
					hm.put(c, 1);
		}
		for(Entry<Character,Integer> entry:hm.entrySet())
		{
		if(entry.getValue()==1)
			{System.out.println("The first non repeated char is:"+entry.getKey()+" "+entry.getValue());
				break;
			}
		}
		for(Entry<Character,Integer> entry:hm.entrySet())
		{
			if(entry.getValue()>1)	
			{
				System.out.println("The first repeated char is:"+entry.getKey()+" "+entry.getValue());
			
			break;
			}
		}
			
		
	}
     
}
