package list_Concepts1;

public class Starpattern2 {

	public static void main(String[] args) {

		//1)star pattern1
		
		System.out.println("Star Pattern 1");
		starpattern1(6);
		
		
		System.out.println("Star Pattern 2");
		starpattern2(6);
		
		
		System.out.println("Star Pattern 3");
		starpattern3(6);

		System.out.println("Star Pattern 4");
		starpattern4(6);
		
		
		System.out.println("Star Pattern 5");
		starpattern5(10);
		
		System.out.println("Star Pattern 8");
		starpattern8(6);
		

		System.out.println("Star Pattern 9");
		starpattern9(6);
		
		/*
*		 * *
**
***
****
*****
******
pattern2
******
*****
****
***
**
*
pattern3
     *
    ***
   *****
  *******
 *********
______________________________
     *
    **
   ***
  ****
 *****
Star Pattern 5
 *********
  *******
   *****
    ***
     *
     *
    ***
   *****
  *******
 *********

    
     
star 7
______________________________
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
star pattern 8
______________________________
*        *
**      **
***    ***
****  ****
**********
______________________________
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		

	}
	
	
	public static void starpattern1(int rows)
	{
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				System.out.print("*");
				
			}
			
			for(int j=i+1;j<=rows;j++)
			{
				System.out.print(" ");
				
			}
			
			System.out.println();
			
		}
		System.out.println();System.out.println();
		
	}
	
	
	public static void starpattern2(int rows)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=rows;j>i;j--)
			{
				System.out.print("*");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
		System.out.println();System.out.println();
	}
	
	public static void starpattern3(int rows)
	{
		for(int i=1;i<rows;i++)
		{
			for(int j=rows;j>i;j--)
			{
				
				System.out.print(" ");
				
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
		}
		System.out.println();System.out.println();
		
		
	}
	
	
	public static void starpattern4(int rows)
	{
		for(int i=0;i<=rows;i++)
		{
			for(int j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
	public static void starpattern5(int rows)
	{

		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=rows;j>i*2-1;j--)   
			{							 
				System.out.print("*");    
										 
			}
			System.out.println();
			if(i==5)
			{				
			
			break;
			}
		}
		for(int i=1;i<=rows-5;i++)
		{
			for(int j=rows-4;j>i;j--)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}
	
	public static void starpattern8(int rows)
	{
		int space=9;
		for(int i=1;i<rows;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=space;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			space=space-1;
			System.out.println();
		}
	}
	
	public static void starpattern9(int rows)
	{
		int space=0;
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				
				System.out.print("*");
				
			}
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int j=rows;j>=i;j--)
			{
				System.out.print("*");
			}
			space=space+2;
			System.out.println(); 
			
			
		}
		int space1=10;
		for(int i=1;i<=rows;i++) 
		{
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=0;j<space1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			space1=space1-2;
		System.out.println();
		
	}

	}
	}
