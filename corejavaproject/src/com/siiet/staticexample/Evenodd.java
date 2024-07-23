package com.siiet.staticexample;

import java.util.Scanner;

public class Evenodd {
	
	public static void main(String[]args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("the number is even"+n);
		}
		else {
			System.out.println("the number is odd"+n);
		}
		
	}

}
