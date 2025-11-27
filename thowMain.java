package com.codegnan.throw_throwsException;

public class thowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/0);
//		throw new ArithmeticException("Not Divisible by zero");
		int num=10;
		if(num<0) {
			throw new IllegalArgumentException("number must be positive");
		} else {
			System.out.println("hi");
		}
	}

}
