package datautilities;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.Range;
import org.jfree.data.Values2D;
import org.junit.Before;
import org.junit.Test;

public class TestCalculateColumnTotal {
	private Values2D values2D; 
	private Values2D values2DEmpty; 
	@Before
	public void setUp() throws Exception {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues; 
		testValues.addValue(1, 0, 0); 
		testValues.addValue(2, 0, 1);
		testValues.addValue(3, 0, 2); 
		testValues.addValue(4, 0, 3);
		testValues.addValue(5, 0, 4);
		
		testValues.addValue(4, 1, 0); 
		testValues.addValue(5, 1, 1);
		testValues.addValue(6, 1, 2); 
		testValues.addValue(7, 1, 3);
		testValues.addValue(8, 1, 4);
		
		// empty data
		DefaultKeyedValues2D testValuesEmpty = new DefaultKeyedValues2D();
		values2DEmpty = testValuesEmpty;
	}

    @Test
    public void test01MinMinusOne() {
        try {
        	int colIndex = -1;
        	DataUtilities.calculateColumnTotal(values2D, colIndex);
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
	    	int colIndex = 0;
	        assertEquals("The output should be 5.0", 5.0 , DataUtilities.calculateColumnTotal(values2D, colIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test03MinPlusOne() {
	    try {
	    	int colIndex = 1;
	        assertEquals("The output should be 7.0", 7.0 , DataUtilities.calculateColumnTotal(values2D, colIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test04Normal() {
	    try {
	    	int colIndex = 2;
	        assertEquals("The output should be 9.0", 9.0 , DataUtilities.calculateColumnTotal(values2D, colIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test05MaxMinusOne() {
	    try {
	    	int colIndex = 3;
	        assertEquals("The output should be 11.0", 11.0 , DataUtilities.calculateColumnTotal(values2D, colIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test06Max() {
	    try {
	    	int colIndex = 4;
	        assertEquals("The output should be 13.0", 13.0 , DataUtilities.calculateColumnTotal(values2D, colIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test07MaxPlusOne() {
        try {
        	int colIndex = 5;
        	DataUtilities.calculateColumnTotal(values2D, colIndex);
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
	        assertEquals("The output should be 0.0", 0.0 , DataUtilities.calculateColumnTotal(values2DEmpty, colIndex), 0.0000001d);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void test09NullObjPassed() {
        try {
        	Values2D nullData = null;
        	int colIndex = 5;
        	DataUtilities.calculateColumnTotal(nullData, colIndex);
            fail("Expected an error to be thrown");
        } catch (Exception e) {
            String expectedMessage = "Null 'data' argument.";
            String actualMessage = e.getMessage();
            assertTrue("Exception message does not match expected. Actual message: " + actualMessage,
                    actualMessage.contains(expectedMessage));
        }
    }

}
