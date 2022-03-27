package com.WrapperClasses;

public class Example7 {
	public static void main(String[] args)
	{
		
		//AUTOBOXING
		
		short a = 123;
		Short a1 = Short.valueOf(a);
		System.out.println(a1);
		
		System.out.println("*************************");
		
		//AUTO UNBOXING
		short s = 20;
		Short s1 = new Short(s);
		short value = s1.shortValue();
		System.out.println(value);
		
		
		
	}

}
