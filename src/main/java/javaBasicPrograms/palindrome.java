package javaBasicPrograms;

import java.util.ArrayList;

public class palindrome {

	public static void main(String[] args) {
		
		
		ispalindrome(121);
		revstring("Welcome To Shweta");
		
		String s= "BidaR";
		String q= "";
		
		//Method1:
		/*Do we have reverse in string. No
		 * Stringbuffer is used for the same
		 *  
		 */
		String t=s;
		 for(int i=s.length()-1;i>=0;i--)
		 {
			q=q+s.charAt(i);
			 
		 }
		 
		 if(t.equals(q))
			 System.out.println("the string is palindrome");
		 else
			 System.out.println("string is not a palindrome");
		
		 //Method2:
		 StringBuffer sb=new StringBuffer(s);
		 System.out.println(sb.reverse());
		 
		 System.out.println("");
		 
		 fibonacciseries(8);
		 System.out.println("");
		 System.out.println("");
		 primenumber(17);
		
	}



public static void ispalindrome(int num) {
	int r=0;
	int sum=0;
	int t=num;
	
	while(num>0) {
	r=num%10;
	//System.out.println(r);
	sum=sum*10+r;
	//System.out.println(sum);
	num=num/10;
	//System.out.println(num);
	}
	if(sum==t)
	{System.out.println("the no is palindrome");
	
	}else
		System.out.println(sum);
	
	
}	

public static void revstring(String str)
{
	String [] str1=str.split(" ");
	System.out.println(str1[0].toString()+str1[1].toString()+str1[2].toString());
	
	String [] str2= new String[3]    ;
	int count=0;
	for(int i=str1.length-1;i>=0;i--)
	{
			str2[count]=str1[i];
			
			count++;
			
	}
		
	System.out.println("The reversed string is    " + str2[0].toString()+str2[1].toString()+str2[2].toString());
}


public static void fibonacciseries(int a)
{	
	int n1=0,n2=1,n3=0,i;
	
	System.out.print(n1+""+n2);
	
	for(i=2;i<=a;i++)
	{
		n3=n1+n2;
		System.out.print(n3);
		n1=n2;
		n2=n3;
	}
	
}

public static void primenumber(int p)
{
	int m,n,flag=0;
	if(p==0||p==1)
		System.out.println("The no is not prime");
	
	m=p/2;
	
	for(int i=2;i<=m;i++)
	{
		if(p%i==0)
			{
			System.out.println("The no is not prime"+p);
			flag=1;
			break;
			}
			
	}
	if(flag==0)
	System.out.println("The given no is prime  "+p);
}
}
	