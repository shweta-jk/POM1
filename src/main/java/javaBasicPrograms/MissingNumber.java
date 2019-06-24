package javaBasicPrograms;

public class MissingNumber {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,10};
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum +a[i];
			
		}
		
		
		int sum1=0;
		for(int j=0;j<=10;j++) {
			sum1=sum1+j;
		}
		System.out.println("the missing number is  :"  +(sum1-sum));	
	}
	

}


