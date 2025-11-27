package com.codegnan.throw_throwsException;

import java.util.Scanner;

public class ScoreValidator {

	public static String setScore(int score) throws InvalidScoreException{
		if(score < 0 || score > 100) {
			throw new InvalidScoreException();
		}
		return "Score set";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try {
			System.out.println(setScore(n));
		} catch (InvalidScoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
