package com.WrapperClasses;

public class Example4 {
	public static void main(String[] args)
	{
		//AUTOBOXING
boolean valid = true;
		
		//Boolean status = valid;
		
		Boolean status = Boolean.valueOf(valid);
		
		System.out.println(status);
		
		System.out.println("=======================");
		
		//AUTOUNBOXING
		
		Boolean invalid = new Boolean(false);
		
		//boolean comment = invalid;
		boolean comment = invalid.booleanValue();		
		
		System.out.println(comment);
		
	}

	}

