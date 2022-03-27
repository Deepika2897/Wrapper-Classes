package com.WrapperClasses;

public class Example6 {
	public static void main(String[] args)
	{
		//AUTOBOXING
		long l = 234567777;
		Long l1 = Long.valueOf(l);
		System.out.println(l1);
		
		System.out.println("*********************");
		
		//AUTO UNBOXING
		
		
		
		Long l2 = new Long(287834783);
		long value =l2.longValue();
		System.out.println(value);
		
	}

}
