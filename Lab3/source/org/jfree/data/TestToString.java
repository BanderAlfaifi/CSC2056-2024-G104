package org.jfree.data;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestToString {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
    // Test 1: Lower Negative, Upper Positive
    @Test
    public void test01LowerNegativeUpperPositive() {
        try {
            Range r1 = new Range(-5.0, 5.0);
            assertEquals("The output should be Range[-5.0,5.0]", "Range[-5.0,5.0]", r1.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    // Test 2: Lower Negative, Upper Zero
    @Test
    public void test02LowerNegativeUpperZero() {
        try {
            Range r1 = new Range(-5.0, 0.0);
            assertEquals("The output should be Range[-5.0,0.0]", "Range[-5.0,0.0]", r1.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    // Test 3: Lower Negative, Upper Negative
    @Test
    public void test03LowerNegativeUpperNegative() {
        try {
            Range r1 = new Range(-5.0, -5.0);
            assertEquals("The output should be Range[-5.0,-5.0]", "Range[-5.0,-5.0]", r1.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    // Test 4: Lower Zero, Upper Positive
    @Test
    public void test04LowerZeroUpperPositive() {
        try {
            Range r1 = new Range(0.0, 5.0);
            assertEquals("The output should be Range[0.0,5.0]", "Range[0.0,5.0]", r1.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    // Test 5: Lower Zero, Upper Zero
    @Test
    public void test05LowerZeroUpperZero() {
        try {
            Range r1 = new Range(0.0, 0.0);
            assertEquals("The output should be Range[0.0,0.0]", "Range[0.0,0.0]", r1.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    // Test 6: Lower Zero, Upper Negative
    @Test
    public void test06LowerZeroUpperNegative() {
        try {
          Range r1 = new Range(0.0, -5.0);
            fail("Expected an error to be thrown");
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Range(double, double): require lower (0.0) <= upper (-5.0)";
            String actualMessage = e.getMessage();
            assertTrue("Exception message does not match expected. Actual message: " + actualMessage,
                    actualMessage.contains(expectedMessage));
        } catch (Exception e) {
            fail("Expected an IllegalArgumentException, but got another type of exception");
        }
    }

    // Test 7: Lower Positive, Upper Positive
    @Test
    public void test07LowerPositiveUpperPositive() {
        try {
            Range r1 = new Range(5.0, 5.0);
            assertEquals("The output should be Range[5.0,5.0]", "Range[5.0,5.0]", r1.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    // Test 8: Lower Positive, Upper Zero
    @Test
    public void test08LowerPositiveUpperZero() {
        try {
            Range r1 = new Range(5.0, 0.0);
            fail("Expected an error to be thrown");
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Range(double, double): require lower (5.0) <= upper (0.0)";
            String actualMessage = e.getMessage();
            assertTrue("Exception message does not match expected. Actual message: " + actualMessage,
                    actualMessage.contains(expectedMessage));
        } catch (Exception e) {
            fail("Expected an IllegalArgumentException, but got another type of exception");
        }
    }
    
    // Test 9: Lower Positive, Upper Negative
    @Test
    public void test09LowerPositiveUpperNegative() {
        try {
            Range r1 = new Range(5.0, -5.0);
            fail("Expected an error to be thrown");
        } catch (IllegalArgumentException e) {
            String expectedMessage = "Range(double, double): require lower (5.0) <= upper (-5.0)";
            String actualMessage = e.getMessage();
            assertTrue("Exception message does not match expected. Actual message: " + actualMessage,
                    actualMessage.contains(expectedMessage));
        } catch (Exception e) {
            fail("Expected an IllegalArgumentException, but got another type of exception");
        }
    }
	
}
