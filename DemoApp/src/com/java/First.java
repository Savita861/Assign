//Method signature in java
package com.java;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First obj = new First();
		
		System.out.println(obj.hello("Kevin"));
		System.out.println(obj.hello("Kevin",1));
	}
	   
	public String hello(String name)
	{
		return "Hello," +name+ "!";
	}
	
	public String hello(String name, int mood) {
		
		return "Hello" +name+ "!" +(mood == 0? ":("  : ":)");
	} 
	
}
