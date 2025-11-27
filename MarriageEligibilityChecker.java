package com.codegnan.throw_throwsException;

public class MarriageEligibilityChecker {

	public void checkEligibility(int age) throws ToYoungException, ToOldException {
		if(age<18) {
			throw new ToYoungException("Marriage Cannot be approved: age is below 18 years");
		} else  {
			if(age>60) {
				throw new ToOldException("Marriage Cannot be approved: age is above 60 years");
			} else {
				System.out.println("Marriage Approved! Details will be processed soon");
			}
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarriageEligibilityChecker checker = new MarriageEligibilityChecker();
		try {
			checker.checkEligibility(15);
		} catch (ToYoungException | ToOldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
