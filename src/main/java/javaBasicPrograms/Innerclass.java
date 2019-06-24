package javaBasicPrograms;

public class Innerclass {
	int x = 10;

	 public class IClass {
	    int y = 5;
	  }
	

	public static void main(String[] args) {
		Innerclass myOuter = new Innerclass();
		Innerclass.IClass myInner = myOuter.new IClass();
		    System.out.println(myInner.y + myOuter.x);
		  }
		
	}


