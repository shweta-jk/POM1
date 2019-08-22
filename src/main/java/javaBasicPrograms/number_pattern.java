package javaBasicPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class number_pattern {

	public static void main(String[] args) {
		removeDuplicates(new int[] {2, 4, 3, 4, 9, 2});
		/*number1(10);
		charcheck();
		longsubstr();
		int []arr1={42, 15, 12, 8, 6, 32};
		int no=26;
		findSubArray(arr1,no);*/

	}
	
	public static void number1(int num)
	{
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public static void charcheck()
	{
		String s1="javagreen";
		
		char[] arrays1=s1.toCharArray();
		LinkedHashMap<Character,Integer> charmap=new LinkedHashMap<Character,Integer>();
		for(char c:arrays1)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
				charmap.put(c, 1);
		}
		
		for(Entry<Character, Integer> entry:charmap.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("The first non repeated char is   "  +entry.getKey());
			break;
			}
		}
		
		for(Entry<Character, Integer> entry:charmap.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("The first repeated char is  "  +entry.getKey());
			break;
			}
		}
		
	}
	
	public static void longsubstr()
	{
		String s1="javagreen";
		char[] arrays1=s1.toCharArray();
		String longsubstring=null;
		int strlength=0;
		LinkedHashMap<Character,Integer> charmap=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<arrays1.length;i++)
		{		char c=arrays1[i];
			if(!charmap.containsKey(c))
			{
				charmap.put(c, i);
			}else
				{
					i=charmap.get(c);
					charmap.clear();
				}
			
			if(charmap.size()>strlength)
			{
				strlength=charmap.size();
				longsubstring=charmap.keySet().toString();
				
			}
			
			
				
				
		}
		
		System.out.println("The longest substring and its length is: "+longsubstring+ " and its length is "+strlength);
		
		
		
		
	}
	
	public static void findSubArray(int[] inputArray, int inputNumber)
    {
        //Initializing sum with the first element of the inputArray
 
        int sum = inputArray[0];
 
        //Initializing starting point with 0
 
        int start = 0;
 
        //Iterating through inputArray starting from second element
 
        for (int i = 1; i < inputArray.length; i++)
        {
            //Adding inputArray[i] to the current 'sum'
 
            sum = sum + inputArray[i];
 
            //If sum is greater than inputNumber then following loop is executed until
 
            //sum becomes either smaller than or equal to inputNumber
 
            while(sum > inputNumber && start <= i-1)
            {
                //Removing starting elements from the 'sum'
 
                sum = sum - inputArray[start];
 
                //Incrementing start by 1
 
                start++;																								//{42, 15, 12, 8, 6, 32}, 26
            }
 
            //If 'sum' is equal to 'inputNumber' then printing the sub array
 
            if(sum == inputNumber)
            {
                System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
 
                for (int j = start; j <= i; j++)
                {
                    System.out.print(inputArray[j]+" ");
                }
 
                System.out.println();
            }
        }

}
	
	public static void removeDuplicates(int[] arrayWithDuplicates)
    {
        System.out.println("Array With Duplicates : ");
         
        for (int i = 0; i < arrayWithDuplicates.length; i++)
        {
            System.out.print(arrayWithDuplicates[i]+"\t");
        }
         
        //Assuming all elements in input array are unique
         
        int noOfUniqueElements = arrayWithDuplicates.length;
         
        //Comparing each element with all other elements,  2, 4, 3, 4, 9, 2
         
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If any two elements are found equal
                 
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {
                    //Replace duplicate element with last unique element
                     
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
                     
                    //Decrementing noOfUniqueElements
                     
                    noOfUniqueElements--;
                     
                    //Decrementing j
                     
                    j--;
                }
            }
        }
         
        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
         
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
         
        //Printing arrayWithoutDuplicates
         
        System.out.println();
         
        System.out.println("Array Without Duplicates : ");
         
        for (int i = 0; i < arrayWithoutDuplicates.length; i++)
        {
            System.out.print(arrayWithoutDuplicates[i]+"\t");
        }
         
        System.out.println();
         
        System.out.println("==============================");
    }
	
     
}
