package com.control_statements;

public class Bank_Account {
	
	static String bank_name = "sbi";
	static String branch = "harbour";
	static int account_number = 10012010;
	static int ifsc = 8066;
	{
		account_number++;
	}
	
	public static void main(String[] args) {
		
		Bank_Account ba = new Bank_Account();
		ba.display("vasu");
		
		Bank_Account ba1= new Bank_Account();
		ba1.display("ghfjdk");
		
		Bank_Account ba2= new Bank_Account();
		ba2.display("bnm,njmk,");

		
	}
	void display(String name) {
	System.out.println("bank name :"+bank_name);
	System.out.println("bank branch :"+branch);
	System.out.println("account number :"+account_number);
	System.out.println("ifsc code :"+ifsc);
	System.out.println("account holder name :"+name);
	System.out.println("**************************************");
	}

}
