package com.jsp.calculator;

public class Calculator {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	public void div(int a, int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Calculator c1 =new Calculator();
		c1.add(5, 10);
		c1.sub(20, 10);
		c1.mul(10, 20);
		c1.div(50, 10);

	}

}
