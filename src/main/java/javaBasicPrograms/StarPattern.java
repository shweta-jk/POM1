package javaBasicPrograms;

public class StarPattern {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1>String pattern
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 */
		int rows=6;
		starpattern1(rows);
		
		/*
		 * 2>String pattern 2
		 *******
		 ******
		 *****
		 ****
		 ***
		 **
		 **/
		System.out.println("pattern2");
		
		
		starpattern2(rows);
		
		System.out.println("pattern3");
		
		//3> starPattern
		// 	 *
	   //   ***
		// *****
		//*******
	   //*********
		starpattern3(rows);
		
		//4>Star pattern 4
		System.out.println("______________________________");
		starpattern4(rows);
		
		System.out.println("______________________________");
		//5>Star pattern 4
		starpattern5(rows);
		
		System.out.println("______________________________");
		starpattern7(rows);
		System.out.println("______________________________");
		starpattern8(6);
		System.out.println("______________________________");
		starpattern9(6);
	}
	
	
	
	  public static void starpattern1(int rows)
	  { int j=1; 
	  for(int i=1;i<=rows;i++)
	   { while(j<=i) 
	   	{ System.out.print("*");
	  
	        j++; 
	  } System.out.println();
	  j=1;
	  
	  }
	  
	  
	  }
	 
	
	public static void starpattern2(int rows)
	{
		int j=1;
		for(int i=rows;i>=1;i--)
		{
			
			  while(j<=i) { System.out.print("*"); j++; }
			 
			  System.out.println();
			j=1;
		}
		
		
	}

	
	public static void starpattern3(int rows)
	{
		
 		for (int i = 1; i < rows; i++) {
			
			  for (int j = rows; j > i; j--) 
			  { 
				  System.out.print(" ");
			  
			  }
			 
			
			  for (int j = 1; j <= i * 2 - 1; j++)
			  {
				  System.out.print("*");
			  }
			  System.out.println("");
			 
    }
}
	
	public static void starpattern4(int rows)
	{
		
		for(int i=1;i<rows;i++)
		{
			for(int j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			int j;
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			j=1;
			System.out.println();
		}
		
		System.out.println("star 5");
		
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
		}
		
		System.out.println("star 7");
	}
	

	public static void starpattern7(int rows)
	{
		for(int i=1;i<=rows;i++)
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
		for(int i=rows-1;i>=1;i--)
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
		System.out.println("star pattern 8");
		
	}
	
	public static void starpattern8(int rows)
	{
		int space=8;
		for(int i=1;i<rows;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
				
			}
			
			
			System.out.println();
			space=space-2;
		}
		
		
		
		
	}
	
	public static void starpattern9(int rows)
	{
		int space=0;
		for(int i=1;i<rows;i++)
		{
			
			for(int j=rows-1;j>=i;j--)
			{
				System.out.print("*");
			}
			
			
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=rows-1;j>=i;j--)
			{
				System.out.print("*");
			}
			
			space=space+2;
			System.out.println("");
			
		}
		int space1=8;
		for(int i=1;i<rows;i++)
		{
					
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=1;j<=space1;j++)
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
