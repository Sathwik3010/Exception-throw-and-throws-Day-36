package com.codegnan.finalMethod;

public class Customer {

//	final String cname;
//	final String cname="mani"; // declaring final variable with initialization which is type 1 for instance final variable
	static final String cname="Dev"; // declaring static final variable while initializationn which is type 1 for static final variable
	int cid=101;
//	static {
//		cname="Dev"; type 2 inside the static block for static final variable
//	}
	
//	{
//		cname = "ravi"; // type 2 inside the instance block for final variable
//	}
	
//	public Customer() {
//		super();
//		cname="dev";    // type 3 inside a constructor for final variable
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		System.out.println(c.cname+" "+c.cid);
		final String name="Dev"; // method 1
//		name = "Dev";            // method 2
		System.out.println(name);
	}


}
