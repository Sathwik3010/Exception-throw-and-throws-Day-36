package com.codegnan.throw_throwsException;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static String checkPositive(int num) throws NegativeNumberException {
		if(num<0) {
			throw new NegativeNumberException();
		}
		return "Positve";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			System.out.println(checkPositive(num));
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
