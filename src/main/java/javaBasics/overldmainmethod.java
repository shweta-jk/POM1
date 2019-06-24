package javaBasics;

public class overldmainmethod {

	public static void main(String[] args) {
		
		System.out.println("Main method_1");
		String t=main("test");
		int b=main(10);
		System.out.println(t);
		System.out.println(b);
		
		

	}

	public static int main(int a)	
	{
		System.out.println("ovrlad main method_2");
		return a;
	}
	public static  String main(String bargs) {
		
		System.out.println("Main method_3");
		return bargs;
		

	}
}
