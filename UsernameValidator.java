package com.codegnan.throw_throwsException;

import java.util.Scanner;

public class UsernameValidator {

	public static String checkUsername(String username) throws InvalidUsernameException{
		if("null".equals(username)) {
			username = null;
		}
		
		if(username == null || username.length()<5) {
			throw new InvalidUsernameException();
		}
		return "Valid username";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		try {
			System.out.println(checkUsername(username));
		} catch (InvalidUsernameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
