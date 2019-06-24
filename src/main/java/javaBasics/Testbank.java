package javaBasics;

public class Testbank {

	public static void main(String[] args) {
		
		
		System.out.println(Interfaceconcept.min_bal);
		HSBCbank s=new HSBCbank();//static polymorphism
		s.credit();
		s.debit();
		s.carloan();
		s.transfermoney();
		s.educationloan();
		
		
		
		
		Interfaceconcept c=new HSBCbank(); //dynamic polymorphism
		c.credit();
		c.debit();
		c.transfermoney();
		
	}

}
