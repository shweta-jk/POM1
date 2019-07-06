package javaBasicPrograms;

import java.util.Arrays;

public class Stringprograms {

	public static void main(String[] args) {
	
		//1>convert each character to uppercase
		
		String s="honeywell";
		
		convtouppercase(s);
		convtolowercase("WISDOM");
		
		//2)Convert in a string upper to lower and lower to upper
		lowertoupper("SUpeR");
		
		//3)Replace a particular char
		replacechar("Alyyyyyyyyyyyyyy");
		
		//4) Capitalize each word in a string
		capitalize("java is an object oriented programming language");
		
		//5)Toggle the string
		toggle("java is an object oriented programming language");
		
		//6)Array anagram
		arrAnagram("motherinlaw","hitlerwoman");
		
		
		//7)duplicate characters in a string
		dupwordsstrings("Java is a Java and program due is there Java good program");
		
		dupcharstring("shesellsseashellsontheseashore");
		
		
		
	}
	
	public static void convtouppercase(String str)
	{
		
		String us=str.toUpperCase();
		System.out.println(us);
	}
	
	public static void convtolowercase(String str)
	{
		String us=str.toLowerCase();
		System.out.println(us);
	}
	
	
	public static void lowertoupper(String str)
	{
		String s1=str;
		
		int len=s1.length();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char us=s1.charAt(i);
			if((int)us>96 && (int)us<123)
			{
				us=(char) (us-32);
				System.out.print(us);
			}else if((int)us<96)
			{
				us=(char)(us+32);
			System.out.print(us);
			}
			}
	}
	
	public static void replacechar(String str)
	{
		String s="";
		for(int i=0;i<=str.length()-1;i++)
		{
			
				 s=str.replace('y', 'e');
					
		}
		
		System.out.println(s);
		
	} 
	
	public static void capitalize(String str)
	{
		int k=0;
		char s1='a';
	
		String[] arrstr=str.split(" ");
		
		while( k<=arrstr.length-1)
		{
			
		for(int i=0;i<=arrstr[k].length()-1;i++)
		{
			String s=arrstr[k];
		
			if(i==0)
			{
				 s1=s.charAt(i);
				s1=(char)(s1-32);
				System.out.print(s1+s.substring(i+1)+" ");
				
			}
				
		}
		k=k+1;
		
	}
		
		System.out.println();

}
	
	public static void toggle(String str)
	{
		int k=0;
		char s2='a';
		String ts="a";
		String s="b";
		String [] arrstr=str.split(" ");
		while(k<=arrstr.length-1)
		{
			for(int i=0;i<=arrstr[k].length()-1;i++)
			{
				
				 s=arrstr[k];
				if(i==0)
				 s2=s.charAt(i);
				
				
					 
			}
			System.out.print(s2+s.substring(1).toUpperCase()+" "); 
		
			k=k+1;
		}
		System.out.println();
		
		System.out.println();
	}
	
	public static void arrAnagram(String s1,String s2)
	{
		String str1=s1.replaceAll("\\s","");
		
		String str2=s2.replaceAll("\\s","");
		
		boolean status=false;
		if(s1.length()!=s2.length())
		{
			
			status=false;
			
		}else
		{
			
			char[] Arrays1=str1.toLowerCase().toCharArray();
			char[] Arrays2=str2.toLowerCase().toCharArray();
			Arrays.sort(Arrays1);
			Arrays.sort(Arrays2);
			status=Arrays.equals(Arrays1,Arrays2);
			
			if(status)
				System.out.println("The strings   "+s1+"  "+s2+" are anagrams");
			else
				System.out.println("The strings are not anagrams");
			
		
		}
		
	}
	
	public static void dupwordsstrings(String str)
	{
		//Java is a Java and program due is there Java good program
		
		String[] words=str.split(" ");	//Split the word from String
		int wrc=1;							//Variable for getting Repeated word count
		
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{	wrc=1;
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					wrc=wrc+1;				//if equal increment the count
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0" && wrc>1)
			System.out.println(words[i]+"--"+wrc);	//Printing the word along with count
			
			System.out.println();
	     }  
			
	}
	//dupcharstring(shesellsseashellsontheseashore)
	
	public static void dupcharstring(String str)
	{
		char[] Arrays1=str.toCharArray();
		int max=2;
		char dupchar='0';
		
		  for(int i=0;i<Arrays1.length;i++) 
		  {  int chrcount=1;
			  for(int j=i+1;j<Arrays1.length;j++)
			  {
				  if(Arrays1[i]==Arrays1[j])
				  {
					  
					  chrcount++;
					  Arrays1[j]='0';
				  }
			  }
			  if(Arrays1[i]!='0' && chrcount>1)
				{ 
				  System.out.println(Arrays1[i]+" "+chrcount);
				} 
					if(max<chrcount && Arrays1[i]!='0')
						{
							max=chrcount;
						
							dupchar=Arrays1[i];
				  
						}
				  
			}
		  System.out.println(max+" "+dupchar);
		  
	}
		
	}
		
		
		  

		 
		


