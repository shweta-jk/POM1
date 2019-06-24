package javaBasics;

public class JavaConcepts {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		String x="Hello";
		String y="World";
		System.out.println("sum of a and b is"+(a+b));
		// ***Execution is from left to right:***
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		System.out.println((x+y)+(a+b));
		System.out.println(x+(y+a)+b);
		
		int i[]= new int[4];
		String j="100";
		double d=Double.parseDouble(j);
		
		System.out.println(d);
		System.out.println(i.length);
		
		
		
	}

}
