package javaBasics;

public class Basics1 {

	public static void main(String[] args) {
		
		//1.factorial of a number
		
		int i=5;
		int fact=5;
		
		while(i>1)
		{
			 fact=fact*(i-1);
			 
			 i--;
					
		}
		
		System.out.println("The fact of the no is:"+ fact);
		
		//2.palindrome
		
		int num=1212121;
		int sum=0;
		int r=0;
		
		
		int t=num;
		while(num>0)
		{
		r=num%10;
		sum=sum*10+r;
		num=num/10;		
		}
		
		if(sum==t)
			System.out.println("The no is palindrome:"+sum);
		else
			System.out.println("The no is not a palindrome:"+sum);
		
		
		
		
		//3)largest and smallest no
		
			int [] nos= {20,-10,36,-78,120,15,-5,16,-120};
			
			int largest=nos[0];
			int smallest=nos[0];
			for(int k=1;k<nos.length;k++)
			{
				if(largest<nos[k])
					largest=nos[k];
				if(smallest>nos[k])
					smallest=nos[k];
				
			}
			
			System.out.println("The largest no is" +   largest);
			System.out.println("The smallest no is" +  smallest);
			
			
			//4) missing no
			int nums[]= {1,2,3,4,5,6,8,9,10};
			int sum1=0;
			for(int m=0;m<nums.length;m++)
			{
				sum1=sum1+nums[m];
				
			}
			System.out.println(sum1);
			int sum2=0;
			for(int n=1;n<=10;n++)
			{
				sum2=sum2+n;
				
			}
			System.out.println(sum2);
			System.out.println("The missing no is  " + (sum2-sum1));	
			
			//5.Swap two strings without using third variable
			String a="hello world";
			String b="Its Amazing";
		 		a=a+b;
		 		System.out.println(a);
		 		b=a.substring(0, b.length());
		 		a=a.substring(a.length()-b.length());
		 		
		 	System.out.println("The two swapped strings are  "+a);
		 	System.out.println("The two swapped strings are  "+b);
		 		
		 		
		 	int x=10;
		 	int y=20;
		 	x=x+y;
		 	y=x-y;
		 	x=x-y;
		 	
		 	System.out.println("The two swapped nos are x="+x +"********y="  +y);
		 	
		 	
		 	
		 	
			
			
	}

}
