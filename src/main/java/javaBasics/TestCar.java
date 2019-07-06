package javaBasics;

public class TestCar {

	public static void main(String[] args) {
		
		
		//static polymorphism--compile time polymorphism--method overriding
		//same method with same name and no of arguments in child class gets executed
		BMWCar b=new BMWCar();
		b.starts();
		b.stops();
		b.theftsafety();
		b.engine();
		Car.music();
		
		System.out.println("******************");
		Car c=new Car();
		c.starts();
		c.stops();
		//c.theftsafety(); Cannot inherit child class methods
		
		//Top Casting
		Car c1=new BMWCar();//child class object can be referred by parent class reference variable--dynamic polymorphism-run time polymorphism
		c1.starts();
		c1.stops();
		c1.engine();
		//c1.theftsafety(); //cannot be accessed theftsafety is unique to the child,only common methods can be executed.
		
		
		//Down Casting
		//BMWCar b1=(BMWCar)new Car();//gives ClasscastException;
		
		BMWCar b1=new BMWCar(10);//right method of calling the constructor
		//b1.BMWCar(10);//constructor cannot be called like this
		
		
		
		
		
		
		
		

	}

}
