package com.jsp;

public class Calculator {
	
	int a=10;
	int b=20;
	void add(int a ,int b){
		System.out.println("addition "+(a+b));
		
	}void sub(int a ,int b){
		System.out.println("substraction "+(a-b));
	}
	void div(int a ,int b){
		System.out.println("division "+(a/b));
	}
	
public static void main(String[] args) {
	
	Calculator calculator=new Calculator();
	calculator.add(10, 20);
	calculator.sub(20, 10);
	calculator.div(10, 2);
	
	
}
}
