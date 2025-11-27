package com.codegnan.throw_throwsException;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("InsufficientBalanceException");
	}
}