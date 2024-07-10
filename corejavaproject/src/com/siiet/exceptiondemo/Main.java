package com.siiet.exceptiondemo;

public class Main { 
	public static void main(String[] args) {
		
		int d=0;
		try {
			int a=55/0;
			System.out.println("hello");
			
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught");
		}
	}
	
	

}
