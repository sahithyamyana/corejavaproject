package com.siiet.throwexample;

import java.util.Scanner;

public class Userdefined {
	
	private static int age;
	
	static void volidate() throws Age{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if (age<18)
			throw new Age("invalid age,you are not eligible");
		else
			System.out.println("you can vote");
	}
	public static void main(String[] args) {
		try {
			Userdefined.volidate();
			
		}catch(Age e) {
			System.out.println("caught exception "+e.getMessage());
		}
	}

}
