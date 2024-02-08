package tests;

import java.util.Date;

import model.Account;
import utils.TestUtils;

public class AccountTest {

	
	
	public static void testConstructor() {
		// manual testing
		Date testDate = new Date();
		Account testAccount = new Account("403", "ali@gmail.com", "Savings", testDate );
		System.out.println(testAccount);
		
		// Automated Testing
		String account_number = "1234";
		String username_of_account_holder = "max12@outlook.com";
		String account_type = "Savings";
		Date account_opening_date = new Date();
		
		
		Account testAccount2 = new Account(account_number, username_of_account_holder, account_type, account_opening_date );
		
		if(testAccount2.getAccount_number() == account_number)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getAccount_number-Passed" + TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getAccount_number-FAILD" + TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount2.getUsername_of_account_holder() == username_of_account_holder)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getUsername_of_account_holder-Passed" + TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getUsername_of_account_holder-FAILD" + TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount2.getAccount_type() == account_type)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getAccount_type-Passed" + TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getAccount_type-FAILD" + TestUtils.TEXT_COLOR_RESET);
		
		if(testAccount2.getAccount_opening_date() == account_opening_date)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getAccount_opening_date-Passed" + TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getAccount_opening_date-FAILD" + TestUtils.TEXT_COLOR_RESET);
		
		
		// using Assert
		assert testAccount2.getAccount_number() == account_number;
		
		assert testAccount2.getUsername_of_account_holder() == username_of_account_holder;
		
		assert testAccount2.getAccount_type() == account_type;
		
		assert testAccount2.getAccount_opening_date() == account_opening_date;
		
		System.out.println("All java assertions has passed !");
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		testConstructor();
	}

}
