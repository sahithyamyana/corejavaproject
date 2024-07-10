package com.siiet.finallyblock;

public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught "+e.getMessage());
		}
		finally {
			System.out.println("finally");
			
		}
		System.out.println("end");
	}

}
