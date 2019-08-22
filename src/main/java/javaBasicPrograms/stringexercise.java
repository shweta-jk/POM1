package javaBasicPrograms;

public class stringexercise {

	public static void main(String[] args) {
		/*String s2="HelloThere";
		String s1="JavaGreenly";
		System.out.println(s1.substring(1)+s2.substring(s2.length()-2,s2.length()));
		
		  String s3=s1.substring(0,3);
		  String s4=s1.substring(s1.length()-3,s1.length());
		  System.out.println(s3+s4);
		 */
		/*
		  String str="hxxxi";
		  String c="";
		  
		  String s1="x";
		  String s2="x";
		  String s6=str.substring(0,1);
		  if(str.substring(0,1).equals(s6));
		  str.substring(s1.length(),0);
		  //System.out.println(s1+""+s2);
		  if(s1.equals(str.substring(0,1)))  
		  {
		    String s3=str.replace(s1,c);
		    //System.out.println(s3);
		    //return s3;s6
		  }
		  else if(s2.equals(str.substring(1,2)))
		  {
		  String s3=str.replace(s2,"");
		  	System.out.println(s3);
		  //return s3;
		  }
		  else if(str.substring(0,2).equals(s1+s2))
		  {
		    String s3=(str.replace(s1,""));
		    String s4=str.replace(s2,"");
		    System.out.println(s3);
		    System.out.println(s4);
		  }
		  */
	
	
	String base="Hello There";
	String cbase="";
	base.toLowerCase();
	      if(base.contains("llo"))
	      cbase= base.replace("llo","");
	     
	  
	  System.out.println(cbase);
	  
	  
	  String dig="abcd3hgf4jh6jh7";
	  char [] array1=dig.toCharArray();
	  boolean t=false;
	 char sdig='a';
	 String dig1=dig.replaceAll("[^0-9]", "");
	 for(int i=0;i<array1.length;i++)
	 {
		 if(Character.isDigit(array1[i]))
		 {sdig=array1[i];
		 System.out.println(sdig);}
		 
	 }
	 System.out.println(sdig+" "+dig1);
	}
}
