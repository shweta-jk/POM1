package javaBasicPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Logic_programs1 {

	public static void main(String[] args) throws IOException {
		boolean b=makeBricks(3,2,9);
		System.out.println(b);
		int l=loneSum(3,3,3);
		System.out.println(l);
		arraydup();
		removewhitespace();
		arrayl();

	}
	
	/*
	 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
	 * Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.
	 */
	
	public static boolean makeBricks(int small, int big, int goal) {
		  
	    int big1=5,small1=1,rem=0,j=0;
	    for(int i=1;i<=big;i++)
	    { 
	     if((small+big1)==goal)
	     return true;
	     else if(small+big1*i==goal)
	     return true;
	     else if(big1*i==goal)
	     return true;
	     else if(small==goal)
	     return true;
	     else 
	    	 while(j<=small)
	         {
	           if(small1*j+big1*i==goal)
	           {
	           System.out.println(small1*j+big1*i);
	           return true;
	           }
	           else
	        	   j++;
	             
	         }
	    
	      
	    


	    }
	    
	    return false;
	}
	
	
	
	
	public static int loneSum(int a, int b, int c) {
		  if(a==b && a!=c)
		  return c;
		  else if(a==c && a!=b)
		  return b;
		  else if(b==c && b!=a)
		  return a;
		  else if(a==b && a==c && b==c) 
		  return 0;
		  else
		  return(a+b+c);
		  
		}
	
	
	public static void arraydup()
	{
		int a1[]= {1,4,2,6,7,9,3,5};
		int a2[]= {0,8,10,1,3,5,4,11};
		int count=0,len=0,count1=0,len2=0,count2=0;
		
		for(int i=0;i<a1.length;i++)
		{	for(int j=0;j<a1.length;j++)
			{
				if(a1[i]==a2[j])
				{count++;
				 a1[i]=(int)'*';
				}
			}
		}
		System.out.println(count);
		len=a1.length+a2.length-count;
		System.out.println(len);
		
		
		int a3 []=new int[len];
		for(int i=0;i<a1.length;i++)					 /* {1,4,2,6,7,9,3,5};
												int a2[]= {0,8,10,1,3,5,4,11};*/
		{
			if(a1[i]!=(int)'*')
				a3[i]=a1[i];
		}
		
		
		
		for(int i=0;i<a3.length;i++)
		{
			if(a3[i]==0)
			{
				a3[i]=a2[count2];
				count2++;
			}
			
			System.out.println(a3[i]);
		}
	}
	
	
	public static void removewhitespace()
	{
		String s1="Hello Java Program";
		
		String s2=s1.replaceAll(" ", ""); 
		System.out.println(s2);
	}
		
	public static void arrayl() throws IOException
	{
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String mostrepword="";
		int count=0;
		BufferedReader reader=null;
		reader=new BufferedReader(new FileReader("C:\\Users\\shwet\\OneDrive\\Documents\\sample.txt"));
		String currentLine=reader.readLine();
		while(currentLine!=null)
		{
			String[] words=currentLine.split(" ");
			for(String word:words)
			{
				if(hm.containsKey(word))
						hm.put(word, hm.get(word)+1);
				else
					hm.put(word, 1);
			}
			currentLine=reader.readLine();
			
		}
		for(Entry<String,Integer> entry:hm.entrySet())
		{
			
			if(entry.getValue()>1)
			{
				mostrepword=entry.getKey();
				count=entry.getValue();
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
			
		}
		
		
		 reader.close();
	}
	
}
