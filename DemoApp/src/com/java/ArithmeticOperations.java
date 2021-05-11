package com.java;
import java.util.Scanner;
public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//input two number from user
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter first number :");
		int num2 = sc.nextInt();
		
		//perform arithmetic operation
		int sum = num1 + num2;
		int product = num1 * num2;
		int different = num1 - num2;
		int quotient = num1 / num2;
		
		//print result to console
		System.out.println("sum :" +sum);
		System.out.println("product :" +product);
		System.out.println("different :" +different);
		System.out.println("quotient :" +quotient);
	}

}
