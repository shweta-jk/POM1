package javaBasics;

public class TestAbstractclass {

	public static void main(String[] args) {
		ICICIbank ib=new ICICIbank();
		ib.loan();
		ib.credit();
		ib.debit();
		ib.interest();
		ib.ifsccode=90;
		
		Abstractclass ic=new ICICIbank();
		ic.loan();
		ic.credit();
		ic.debit();
		System.out.println(ic.ifsccode);
		

	}

	
}
