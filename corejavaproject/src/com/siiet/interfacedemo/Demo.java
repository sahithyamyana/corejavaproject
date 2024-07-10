package com.siiet.interfacedemo;

public class Demo implements Childinterface {
	
	@Override
	public void print() {
		System.out.println("print");
	}
	@Override
	public void show() {
		System.out.println("show");
		
	}
	
	public static void main(String[] args){
		Demo d=new Demo();
		d.show();
		d.print();
		
	}


}
