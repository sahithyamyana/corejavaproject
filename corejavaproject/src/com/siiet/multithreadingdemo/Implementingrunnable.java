package com.siiet.multithreadingdemo;

public class Implementingrunnable implements Runnable{

	public static void main(String[] args) {
	
		Implementingrunnable r=new Implementingrunnable();
		//new state
		
		//r.start();
		Thread t1=new Thread();
		t1.start();
		
	}
	@Override
	public void run() {
		System.out.println("implementing runnable interface");
	}

}
