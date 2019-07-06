package javaBasics;

public class Testbank {

	public static void main(String[] args) {
		
		
		System.out.println(Interfaceconcept.min_bal);
		//System.out.println(Abstractclass.ifsccode);
		HSBCbank s=new HSBCbank();//static polymorphism
		s.credit();
		s.debit();
		s.carloan();
		s.transfermoney();
		s.educationloan();
		//System.out.println(s.ifsccode);
		
		ICICIbank ic=new ICICIbank();
		System.out.println(ic.ifsccode);
		
		
		
		
		
		Interfaceconcept c=new HSBCbank(); //dynamic polymorphism
		c.credit();
		c.debit();
		c.transfermoney();
		
	}

}
