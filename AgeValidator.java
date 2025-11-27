package com.codegnan.throw_throwsException;

import java.util.Scanner;

public class AgeValidator {

	public static String setAge(int age) throws InvalidAgeException{
		if(age < 0 || age > 150) {
			throw new InvalidAgeException();
		}
		return "Age set";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		try {
			System.out.println(setAge(age));
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
            System.out.println(e.getMessage());
		}
	}

}
