package com.WrapperClasses;

public class Example3 {
	public static void main(String[] args)
	{
		
char grade = 'A';
		
		//Character g1 = grade;
		Character g1 = Character.valueOf(grade);
		
		
		System.out.println(g1);
		
		System.out.println("=========================");
		
		Character c1 = new Character('9');
		
		//char rank = c1;
		char rank = c1.charValue();
		
		
		System.out.println(rank);

	}
	}


