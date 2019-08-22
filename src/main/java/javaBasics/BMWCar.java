package javaBasics;

public class BMWCar extends Car {
	
	public BMWCar()
	{
		System.out.println("inside const");
	}
	
	public BMWCar(int a)
	{
		System.out.println("inside const"+a);
	}
	
	public void starts()
	{
		System.out.println("BMW car-----starts");
	}
	
	public void stops()
	{
		System.out.println("BMW car--------stops");
	}
	
	public static void theftsafety()
	{
		System.out.println("BMW special feature");
	}
	
	
	

}
