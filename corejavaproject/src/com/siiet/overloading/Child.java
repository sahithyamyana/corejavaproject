package com.siiet.overloading;

public class Child extends Father{

	@Override
	int drinking() {
		System.out.println("horlicks");
		return 0;
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.drinking();
	}

}
