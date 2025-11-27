package com.codegnan.throw_throwsException;

import java.util.Scanner;

public class BankAccount {

	public static String withdraw(int balance, int amount)throws InsufficientBalanceException{
		
		if(amount > balance) {
			throw new InsufficientBalanceException();
		}
		return "Withdrawn";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = sc.nextInt();
		int amount  = sc.nextInt();
		
		try {
			String result = withdraw(balance, amount);
			System.out.println(result);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
