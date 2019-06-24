package javaBasicPrograms;

public class largestandsmallest {

	public static void main(String[] args) {
		
		int a[]= {20,-10,30,40,-20,-555,900,0};
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
				largest=a[i];
			if(a[i]<smallest)
				smallest=a[i];
			
		}
		
		System.out.println("the largest no is"+largest);
		
		System.out.println("the smallest no is"+smallest);
		
	}

}
