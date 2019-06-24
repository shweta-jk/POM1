package javaBasicPrograms;

import java.util.Arrays;

public class Factorial {
/*
	public static void main(String[] args) {
		int a=5;
		int num=5;
		while(a>1) {
			
			num=num*(a-1);
			
			a=a-1;
			
			
		}
		
		System.out.println(num);
		
	}*/
	
	

		public static Object[] getDetails()
		{
			String name = "Ryan";
			int age = 25;
			char gender = 'M';
			long income = 100000;

			return new Object[] { name, age, gender, income };
		}

		// Return multiple values from a method in Java
		public static void main(String[] args)
		{
			Object[] person = getDetails();
			System.out.println(person.length);
		}
	}


