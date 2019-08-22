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
		
		
	String string="jawshavingjaws";
	
	String a="";
	  
	  int m= string.length()/2;
	  for(int i=0;i<m;i++)
	  {
	    for(int j=string.length()-1;j>=m;j--)
	    {
	      if(string.charAt(i)==string.charAt(j))
	      {
	    	   a=a+string.charAt(i);
	    		 j=m+1;
	    	 
	      }
	    }

	  }
	  System.out.println(a);
	}
}
