package tests;
import model.User;
import utils.TestUtils;

public class UserTest {
	
	public static void testUserConstructor() {
		// Manual Testing
		User testUser = new User("mike", "my_password", "Mike", "Smith", "07771234567");
		System.out.println(testUser);
		
		// Automated Testing
	     // 1-Setup
		String test_username = "mike"; 
		String test_password = "my_password";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		 // 2-Exercise, run the objects under test (constructors)
		User testUserForAutoTest = new User(test_username, test_password, test_first_name,
				test_last_name, test_mobile_number);
		
		// 3-Verify (Assert)
		System.out.println("Starting the asertions of the test methods: testUserConstructor");
		if (testUser.getUsername() == test_username)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getUserName-Passed" + TestUtils.TEXT_COLOR_RESET);
		else 
			System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getUserName-FAILD" + TestUtils.TEXT_COLOR_RESET);
		
		if (testUser.getPassword() == test_password)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getPassword-Passed" + TestUtils.TEXT_COLOR_RESET);
		else 
			System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-getPassword-FAILD" + TestUtils.TEXT_COLOR_RESET);
		
		// Test for firstName
		if (testUserForAutoTest.getFirst_name().equals(test_first_name))
		    System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-getFirst_name-Passed" + TestUtils.TEXT_COLOR_RESET);
		else 
		    System.out.println(TestUtils.TEXT_COLOR_RED + "TC3-getFirst_name-FAILED" + TestUtils.TEXT_COLOR_RESET);

		// Test for lastName
		if (testUserForAutoTest.getLast_name().equals(test_last_name))
		    System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-getLast_name-Passed" + TestUtils.TEXT_COLOR_RESET);
		else 
		    System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getLast_name-FAILED" + TestUtils.TEXT_COLOR_RESET);

		// Test for mobileNumber
		if (testUserForAutoTest.getMobile_number().equals(test_mobile_number))
		    System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC5-getMobile_number-Passed" + TestUtils.TEXT_COLOR_RESET);
		else 
		    System.out.println(TestUtils.TEXT_COLOR_RED + "TC5-getMobile_number-FAILED" + TestUtils.TEXT_COLOR_RESET);

		/* Using assert */
		
		assert testUser.getUsername() == test_username;
		assert testUser.getPassword() == test_password;
		assert testUserForAutoTest.getFirst_name().equals(test_first_name);
		assert testUserForAutoTest.getLast_name().equals(test_last_name);
		assert testUserForAutoTest.getMobile_number().equals(test_mobile_number);
				
	    	System.out.println("All Java assertins have passed.");
	}
	
	public static void main(String[] args) {
		testUserConstructor();
	}
	
}
