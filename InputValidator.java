package com.codegnan.throw_throwsException;

import java.util.Scanner;

public class InputValidator {

	public static String validateInput(String input) throws InvalidInputException{
		
		if("null".equals(input)) {
			input = null;
		}
		
		if(input == null || input.isEmpty())
			throw new InvalidInputException();
		return "Valid";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		try {
			System.out.println(validateInput(input));
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
