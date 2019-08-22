package javaBasics;

public class TestAbstractclass {

	public static void main(String[] args) {
		
		ICICIbank ib=new ICICIbank(10);
		
		ib.loan();
		ib.credit();
		ib.debit();
		ib.interest();
		ib.ifsccode=90;
		ib.money();
		System.out.println(ib.ifsccode);
		System.out.println(ib.x);
		
		Abstractclass ic=new ICICIbank(0);
		ic.loan();
		ic.credit();
		ic.debit();
		ic.ifsccode=87;
		ic.money();
		System.out.println(ic.ifsccode);
		System.out.println(ic.x);
		

	}

	
}
