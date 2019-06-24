package javaBasicPrograms;

public class JunkcharInString {

	public static void main(String[] args) {
		String s="!@#$^&*Testing)*&^%%QA&%&*Automation*%!%*&()* ";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
