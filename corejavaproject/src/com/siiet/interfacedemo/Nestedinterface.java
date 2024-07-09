package com.siiet.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface {
	
	@Override
    public void print() {
	System.out.println("inner interface");
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
	
	}

}
