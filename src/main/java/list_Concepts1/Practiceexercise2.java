package list_Concepts1;

import java.util.Random;

public class Practiceexercise2 {

	public static void main(String[] args) {
		
		largest(-30,-40,-10);
		smallest(-50,-40,10);
		random(10);
		fact(1);
		sumofnaturals(20);
		int nos[]= {58,3,50,2,5,40,45,55,52,50};
		
		smallest(nos);
		largest(nos);
		sumofdigitsrecursion(873);	
		
		midletter("ShwetaSKulkarni");

	}
	
	
	
	public static void largest(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
			System.out.println("a is largest: " +a);
		}
		if(b>c)
			System.out.println("b is largest: "+b);
		else
			System.out.println("c is the largest:"  +c);
	}
	
	
	public static void smallest(int a,int b,int c)
	{
		if(a<b)
		{if(a<c)
			System.out.println("a is the smallest:"  +a);
		}else if(b<c)
			System.out.println("b is the smallest: " +b);
		else
			System.out.println("c is the smallest:" +c);
	}
	
	public static void random(int r)
	{
		Random q=new Random();
		
		for(int i=0;i<=r;i++)
		{
			System.out.print( q.nextInt(100)+" ");
		}
		
		System.out.println();
	}
	
	
	public static void fact(int nos)
	{
		int sum=0;
		int q=1;
		int num=nos;
		
		for(int i=1;i<nos;i++)
		{
			q=q*(i+1);
		}
		
		System.out.println("The factorial of the given no is: "   +q);
		
	}
	
	public static void sumofnaturals(int nos)
	{
		int j=0;
		for(int i=1;i<=nos;i++)
		{
			j=j+i;
		}
		System.out.println("The sum of first n natural nos is: " +j);
	}
	
	
	public static void smallest(int [] num)
	{
		int smallest1=num[0];
		int smallest2=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(smallest1>num[i])
			{ 
				smallest2=smallest1;
				smallest1=num[i];
			}else if(smallest2>num[i])
				smallest2=num[i];
		}
		
		System.out.println("The smallest and the second smallest are : "  +smallest1+"  "+smallest2);
	}

	public static void largest(int [] num)
	{
		int largest1=num[0];
		int largest2=num[num.length-1];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>largest1)
			{
				largest2=largest1;
				largest1=num[i];
			}else if(num[i]>largest2)
				largest2=num[i];
			
		} 
		
		System.out.println("The largest and the second largest are :"  +largest1+" "+largest2);
	}
	
	
	public static void sumofdigitsrecursion(int num)
	{
		int sum=0;
		int r=0;
		
		
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		
		System.out.println("The sum of digits is:"  +sum);
	}
	
	public static void midletter(String str)
	{
		int mid=str.length()/2;
		
		if(str.length()%2==0)
			System.out.println("The middle chars are:  "+str.charAt(mid-1)+"  "+str.charAt(mid) );
		else if(str.length()%2==1)
			System.out.println("The middle char is: "  +str.charAt(mid));
		
		
	}
}
