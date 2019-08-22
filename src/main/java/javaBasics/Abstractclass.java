package javaBasics;

public abstract class Abstractclass {
	
	/*partial abstraction
	 * hiding the implementation logic is called abstraction
	 * Abstract class can have abstract methods and non abstract methods
	 * cannot create object of Abstract class(same for interface)
	 * Abstract class can have any type of variable int,static,final
	 * In Interface the vriables are final and static by default 
	 */
	int x;
	public Abstractclass(int a)
	{
		this.x=a;
	}
	
	int ifsccode=1234;
	public abstract  void loan();
	
	
	public void credit()
	{
		System.out.println("abstract class credit method");
	}
	
	public void debit()
	{
		System.out.println("abstract class debit method");
	}
	
	public static void money()
	{
		System.out.println("abstract class money method");
	}
	

}
