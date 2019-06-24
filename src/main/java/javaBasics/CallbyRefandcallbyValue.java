package javaBasics;

public class CallbyRefandcallbyValue {
	int p;
	int q;

	public static void main(String[] args) {
		
		CallbyRefandcallbyValue obj= new CallbyRefandcallbyValue();
		//int p,q;
		
		obj.p=50;
		obj.q=60;
		
		obj.sum(10,20);
		obj.sum(obj);
		
		
		

	}
	
	
	public void sum(int a,int b)//Call by value
	{
		
		int c=a+b;
		System.out.println(c);
		
	}
	
	public void sum(CallbyRefandcallbyValue t)//Call by Reference
	{
		int temp=t.p;
		t.p=t.q;
		t.q=temp;
		System.out.println(p+q);
	}

}
