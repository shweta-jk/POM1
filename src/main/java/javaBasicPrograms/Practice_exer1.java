package javaBasicPrograms;

import java.util.Random;

public class Practice_exer1 {

	public static void main(String[] args) {
		
		
		//1)Largest of 3 nos:
				
		largest(10,-10,-50);
		
		//2)Positive,negative or zero:
		nocheck(0);
		
		//3)even or odd
		evenorodd(-11);
		
		//4)Average 
		
		average(10,20,30,40);
		
		//5)Random nos
		random(10);
		
		//6)factorial of a no using for loop
		
		fact(10);
		
		//7)sum of first n natural nos
		
		sumofnaturalnos(5);
		
		int nos[]= {58,3,50,2,5,40,45,55,52,50};
		
		secondsmall(nos);
		secondlarge(nos);
		
		
		
		
		
		
		
		
		
	

	}
	
	
	
	public static void largest(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
				System.out.println("x is the largest "+x);
		}
		else if(y>z)
			System.out.println("y is greater than z and x  "+y);
		else
			System.out.println("z is the largest "+z);
		
	}

	public static void nocheck(int a)
	{
		if(a>0)
			System.out.println("The no is positive  "+a);
		else if(a<0)
			System.out.println("The no is negative  "+a);
		else
			System.out.println("Its a zero  "+a);
		
	}
	
	
	
	public static void evenorodd(int p)
	{
		if(p%2==0)
			System.out.println("Its a even no  "+p);
		
		else
			System.out.println("Its a odd no  "+p);
			
	}
	
	public static void average(int a,int b,int c,int d)
	{
		int avg=(a+b+c+d)/4;
		System.out.println("The avg of the nos is  "+avg);
	}
	
	
	public static void random(int q)
	{
		Random r=new Random();
		for(int i=1;i<=q;i++)
		{
			System.out.println("The random nos are   "+r.nextInt(100));
		}
		
		
	}
	
	public static void fact(int f)
	{
		int q=1;
		for(int i=1;i<f;i++)
		{
			 q=q*(i+1);
			
		}
		
		System.out.println("The factorial of the no is  "+q);
	}
	
	public static void sumofnaturalnos(int num)
	{
			int j=0;
		for(int i=0;i<=num;i++)
		{
			 j=j+i;
		}
		System.out.println("The sum of first '"+num+"' natural nos is  "+j);
		
	}
	
	
	public static void secondsmall(int [] arr)
	{	int flag=0;
		int smallest1=arr[0];
		int smallest2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest1>arr[i] ) //{10,3,50,2,5,40};
				{
					smallest2=smallest1;
					smallest1=arr[i];
				
				}else if(smallest2>arr[i])	
					smallest2=arr[i];
		}	
		
		
		System.out.println(smallest1+"    "+smallest2);			
					
				
		}
	
	public static void secondlarge(int [] arr)
	{
		int large1=arr[0];
		int large2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large1)		//{10,3,50,2,5,40};
				{
				large2=large1;
				large1=arr[i];
				}else if(arr[i]>large2) large2=arr[i];
			 
		}
		
		System.out.println("The first and second largest no is   "+large1+"  " +large2 );
	}
		
	}
	


