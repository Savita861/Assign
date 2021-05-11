package com.java;
import java.util.Scanner;

public class RelationalOpe {

	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		sc = new Scanner(System.in);
		System.out.println("Please enter two integer value :");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Result of a > b = " + (a > b));
		System.out.println("Result of a < b = " + (a < b));
		System.out.println("Result of a <= b = " + (a <= b));
		System.out.println("Result of a >= b = " + (a >= b));
		
	}

}
