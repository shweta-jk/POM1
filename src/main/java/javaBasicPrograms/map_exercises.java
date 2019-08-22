package javaBasicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class map_exercises {

	public static void main(String[] args) {
		
		 String [] str1= {"code","bug","salt", "tea", "soda", "toast"};
		 //pairs(str1);
		 firstChar(str1);
		
		//1
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("a", "candy");
		map.put("b", "bully");
		
		if (map.containsKey("a")) {
		    map.put("b", map.get("a"));
		    map.put("a", "");
		  }
		for(Entry<String, String> str:map.entrySet())
		{
			System.out.println(str.getKey()+" "+str.getValue());
		}
		
		Map<String,String>map1=mapShare(map);
	}

	
	//2
	public static Map<String, String> mapShare(Map<String, String> map) {
		  if(map.containsKey("a"))
		  {
		    map.put("b",map.get("a"));
		  
		  }
		  if(map.containsKey("c"))
		  map.remove("c");
		  
		  return map;
		}
	
	//3
	/*
	 * Modify and return the given map as follows: if the keys "a" and "b" 
	 * are both in the map and have equal values, remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
	 */
	public Map<String, String> mapAB2(Map<String, String> map) {
		  if(map.containsKey("a") && map.containsKey("b"))
		  if(map.get("a").equals(map.get("b")))
		  {map.remove("a");
		  map.remove("b");
		  }
		  
		  return map;
		  
		}
	
	//4
	/*
	Modify and return the given map as follows: if exactly one of the keys "a" or "b" has
	 a value in the map (but not both), set the other to have that same value in the map.


			mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
			mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
			mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"} */
	
	public Map<String, String> mapAB3(Map<String, String> map) {
		  if(map.containsKey("a") && map.get("b")==null)
		  map.put("b",map.get("a"));
		  
		  if(map.containsKey("b") && map.get("a")==null)
		 
		  map.put("a",map.get("b"));
		  
		  return map;
		}


	//5
	/*
	 * Modify and return the given map as follows: if the keys "a" and "b" have values that
	 *  have different lengths, then set "c" to have the longer value. If the values exist 
	 *  and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
	 */
	
	public Map<String, String> mapAB4(Map<String, String> map) {
		  if(map.get("a").length()>map.get("b").length())
		  map.put("c",map.get("a"));
		  else
		  map.put("c",map.get("b"));
		  if(map.get("a").length()==(map.get("b").length()))
		  map.put("a","");
		  map.put("b","");
		  return map;
	
}
	
	//6
	/*
	 * Given an array of strings, return a Map<String, Integer> containing a key for every 
	 * different string in the array, and the value is that string's length.


wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
	 */
	
	public Map<String, Integer> wordLen(String[] strings) {
		  Map<String,Integer> map=new HashMap<String,Integer>();
		  for(String s: strings)
		  { String a=s;
		    map.put(s,a.length());
		  }
		  return map;
}
	
	public static Map<String, String> pairs(String[] strings) {
		   Map<String,String> map=new HashMap<String,String>();
		   String q="";
		   String r="";
		  for(String s:strings)
		  {
		    String a=s;
		    //System.out.println(a);
		    for(int i=0;i<a.length();i++)
		    { 	q="";
	    		r="";
		      if(i==0)
		      {
		      q=q+a.charAt(i);
		     
		      }
		      
		    
		        r=r+a.charAt(a.length()-1);
		    
		      map.put(q,r);
		    
		    }  	
		    
		  }
		  Set<Entry<String,String>> entrySet=map.entrySet();
		  for(Entry<String, String> entry: entrySet)
			{
				System.out.println("key is"+entry.getKey());//+" "+entry.getValue());
				System.out.println("value is"+entry.getValue());
			}
		  

			System.out.println();
			System.out.println();

		return map;
	
		}
	
	
	
	
	
	public static Map<String, String> firstChar(String[] strings) {   //{"code","bug","salt", "tea", "soda", "toast"};
		String q="",r="";
		int flag=0;
		  Map<String,String> map1=new HashMap<String,String>();
		  for(int i=0;i<strings.length;i++)
		  { 	q="";
			  String a1=strings[i];
		    for(int j=i+1;j<strings.length;j++)
		    {String a2=strings[j];
		      for(int k=0;k<a1.length();k++)
		      {
		        if(k==0)
		        {
		          if(a1.charAt(k)==a2.charAt(k))
		          { flag=0;
		        	q=q+a1.charAt(k);
		        	map1.put(q,a1+a2);
		        	flag=1;
		          }
		          
		        }
		      }
		      
		    }
		    
		    r="";
		    for(int k=0;k<a1.length();k++)
		      {
		    	if(flag!=1 && k==0)
		          { r=r+a1.charAt(0);
		          	
		          	  map1.put(r,a1);	
		          } 
		        }
		      }    
		    			
		   
		    
	  /*for(int i=0;i<strings.length;i++)
		  { r="";
		    String a1=strings[i];
		    System.out.println(a1);
		    for(int j=i+1;j<strings.length;j++)
		    {String a2=strings[j];
		      for(int k=0;k<a1.length();k++)
		      {
		        if(k==0)
		        {
		          if(a1.charAt(k)!=a2.charAt(k))
		          {
		            flag=1;
		          }
		        }
		      }  
		    }
		  
		  for(int k=0;k<a1.length();)
		   {  
		     r=r+a1.charAt(0);
		     System.out.println(r);
		    break;
		   }
		  map1.put(r,a1);
		}*/

		 /* for(Entry<String, String> str:map1.entrySet())
					{
				System.out.println(str.getKey()+" "+str.getValue());
			}
		    */
		  
		    
		  
		  

		  for(Entry<String, String> str:map1.entrySet())
			{
			  	System.out.println(str.getKey()+" "+str.getValue());
			}
	
		
	return map1;
	}
	
}	