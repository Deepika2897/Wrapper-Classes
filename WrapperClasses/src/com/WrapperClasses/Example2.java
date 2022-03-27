package com.WrapperClasses;

public class Example2 {
	public static void main(String[] args)
	{//autoboxing
		
		float price = 312.67f;
	
	//Float f = price;
	Float f = Float.valueOf(price);
	
	System.out.println(f);
	
	System.out.println("=====================");
	
	//autounboxing
	
	Float f2 = new Float(314.23f);
	
	//float value = f2;
	float value = f2.floatValue();		
	
	System.out.println(value);
	
		
	}

}
