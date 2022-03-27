package com.WrapperClasses;

public class Example8 {
	public static void main(String[] args)
	{
		
		//AUTOBOXING
		int age = 20;
		Integer myage =Integer.valueOf(age);
		System.out.println(age);
		
		System.out.println("**********************");
		
		//AUTO UNBOXING
		Integer a1=new Integer(21);
		int myage1=a1.intValue();
		System.out.println(myage1);
		
		
		
	}

}
