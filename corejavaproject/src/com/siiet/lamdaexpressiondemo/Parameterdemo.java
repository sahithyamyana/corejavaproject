package com.siiet.lamdaexpressiondemo;

//calculate the area of cube
//parameter

@FunctionalInterface
public class Parameterdemo {
	public static void main(String[] args) {
		Cube c=(a)->{return (a*a*a);};
		System.out.println("cube  of a number"+c.calculate(3));
	}

}
