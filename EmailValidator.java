package com.codegnan.exceptions;

import java.util.Scanner;

public class EmailValidator {

	public static String checkEmail(String email) throws InvalidEmailException{
		if("null".equals(email)) {
			email = null;
		}
		
		if(email == null || !email.contains("@")) {
			throw new InvalidEmailException();
		}
		return "Valid email";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		try {
			System.out.println(checkEmail(email));
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		sc.close();
		}
	}

}
