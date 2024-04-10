package org.jfree.data;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.Values2D;
import org.junit.Before;
import org.junit.Test;

public class TestCalculateRowTotal {

	private Values2D values2D; 
	private Values2D values2DEmpty;
	private Values2D values2DOneElementNull; 
	
	@Before
	public void setUp() throws Exception {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues; 
		testValues.addValue(1, 0, 0); 
		testValues.addValue(2, 0, 1);
		testValues.addValue(3, 1, 0); 
		testValues.addValue(4, 1, 1);
		testValues.addValue(5, 2, 0);	
		testValues.addValue(4, 2, 1); 
		testValues.addValue(5, 3, 0);
		testValues.addValue(6, 3, 1); 
		testValues.addValue(7, 4, 0);
		testValues.addValue(8, 4, 1);
		
		// empty data
		DefaultKeyedValues2D testValuesEmpty = new DefaultKeyedValues2D();
		values2DEmpty = testValuesEmpty;
		
		// One element null
		DefaultKeyedValues2D testValues3 = new DefaultKeyedValues2D();
		values2DOneElementNull = testValues3; 
		testValues3.addValue(null, 0, 0); 
		testValues3.addValue(2, 0, 1);
		
		testValues3.addValue(4, 1, 0); 
		testValues3.addValue(5, 1, 1);

	}

    @Test
    public void test01MinMinusOne() {
        try {
        	int rowIndex = -1;
        	DataUtilities.calculateRowTotal(values2D, rowIndex);
            fail("Expected an error to be thrown");
        } catch (Exception e) {
            String expectedMessage = "Index -1 out of bounds for length 5";
            String actualMessage = e.getMessage();
            assertTrue("Exception message does not match expected. Actual message: " + actualMessage,
                    actualMessage.contains(expectedMessage));
        }
    }
    
    @Test
    public void test02Min() {
	    try {
	    	int rowIndex = 0;
	        assertEquals("The output should be 3.0", 3.0 , DataUtilities.calculateRowTotal(values2D, rowIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test03MinPlusOne() {
	    try {
	    	int rowIndex = 1;
	        assertEquals("The output should be 7.0", 7.0 , DataUtilities.calculateColumnTotal(values2D, rowIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test04Normal() {
	    try {
	    	int rowIndex = 2;
	        assertEquals("The output should be 11.0", 11.0 , DataUtilities.calculateColumnTotal(values2D, rowIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test05MaxMinusOne() {
	    try {
	    	int rowIndex = 3;
	        assertEquals("The output should be 15.0", 15.0 , DataUtilities.calculateRowTotal(values2D, rowIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test06Max() {
	    try {
	    	int rowIndex = 4;
	        assertEquals("The output should be 19.0", 19.0 , DataUtilities.calculateRowTotal(values2D, rowIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test07MaxPlusOne() {
        try {
        	int rowIndex = 5;
        	DataUtilities.calculateRowTotal(values2D, rowIndex);
            fail("Expected an error to be thrown");
        } catch (Exception e) {
            String expectedMessage = "Index 5 out of bounds for length 5";
            String actualMessage = e.getMessage();
            assertTrue("Exception message does not match expected. Actual message: " + actualMessage,
                    actualMessage.contains(expectedMessage));
        }
    }
    
    @Test
    public void Test08EmptyObjPassed() {
	    try {
	    	int colIndex = 0;
	        assertEquals("The output should be 0.0", 0.0 , DataUtilities.calculateRowTotal(values2DEmpty, colIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test09NullObjPassed() {
        try {
        	Values2D nullData = null;
        	int rowIndex = 5;
        	DataUtilities.calculateRowTotal(nullData, rowIndex);
            fail("Expected an error to be thrown");
        } catch (Exception e) {
            String expectedMessage = "Null 'data' argument.";
            String actualMessage = e.getMessage();
            assertTrue("Exception message does not match expected. Actual message: " + actualMessage,
                    actualMessage.contains(expectedMessage));
        }
    }
    
    //BB testing (increasing coverage)
    @Test
    public void test10() {
	    try {
	    	int rowIndex = 0;
	        assertEquals("The output should be 2.0", 2.0 , DataUtilities.calculateRowTotal(values2DOneElementNull, rowIndex), 0.0000001d);
	        
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }


}
