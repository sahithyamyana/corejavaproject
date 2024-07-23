package com.siiet.lamdaexpressiondemo;

public class Lamdademo {

	public static void main(String[] args) {
		
		Message m=()->{return "hello world";};
		System.out.println(m.greet());

	}

}
