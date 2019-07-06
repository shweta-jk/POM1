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
		
		fibowithwhile(8);
		sumofdigitsrecursion(100);	
		reversesentence("My name is Alee");
		
		midletter("ShwetaKulkarni");
		
		
		
		
		
		
		
	

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
		System.out.println();
	}
	
	
	
	public static void fibowithwhile(int a)
	{
		
		int n1=0,n2=1,n3=0,i=2;
		
		System.out.print(n1+""+n2);
		
	while(i<=a)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		i++;
		
		System.out.print(n3);

		
	}
	System.out.println();
	System.out.println();
		
	}
	
	public static void sumofdigitsrecursion(int num)
	{
		int sum=0;
		int ldigit=0;
		int actualnum=num;
		
		while(num>0)
		{
			ldigit=num%10;
			sum=sum+ldigit;
			num=num/10;
			
			
		}
		
		System.out.println("The sum of digits using recursion for the no "+actualnum+"  is:"+sum);
		
		System.out.println();
		
	}
	
	public static void reversesentence(String str)
	{
		int k=0;
		String q="";
		
		String [] newstr=str.split(" ");
	
		while(k<=3)
		{
			String m=newstr[k];
			
		for(int i=newstr[k].length()-1;i>=0;i--)
		{
			q=q+m.charAt(i);
			
		}
		System.out.print(" "+q);
		
		  q=""; k++; }
		 
		/*for(int i=str.length()-1;i>=0;i--)
		{
			q=q+str.charAt(i);
			
		}
		System.out.println("The reversed string is   "+q);*/
		System.out.println();
	}
	
	public static void midletter(String str)
	{
			int mid=str.length()/2;
			System.out.println(mid);
			
			if(str.length()%2==1)
			{
				System.out.println(str.charAt(mid));
			
			}
			
			if(str.length()%2==0)
				{
				int mid1=mid-1;
				System.out.println(str.charAt(mid1)+""+str.charAt(mid));
				}
			
				
		}
		
		
	}
		
	
	


