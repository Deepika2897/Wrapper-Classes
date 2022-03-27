package com.WrapperClasses;

public class Example5 {
	public static void main(String[] args)
	{
	//AUTOBOXING
		double salary = 23456;
		Double d = Double.valueOf(salary);
		System.out.println(d);
		
		
		System.out.println("*************************");
	
		//AUTOUNBOXING
		
		Double d1 = new Double(38493);
		//double value=d1
		double Value = d1.doubleValue();
		System.out.println(d1);
		
		
		
		
		
	}

}
