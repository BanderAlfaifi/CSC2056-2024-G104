package range;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class TestGetLowerBound {

	@Before
	public void setUp() throws Exception {
	}

	   @Test
	    public void test1LowerBoundIsNegative() {
	        try {
	            Range r1 = new Range(-5.0, 0);
	            System.out.println("Test01: " + r1.getLowerBound());
	            assertEquals("The lower bound of Range(-5.0,0) should be -5.0", 
	                    -5.0, r1.getLowerBound(),0.000000001d); 
	        } catch (Exception e) {
	            fail("An error occurred: " + e.getMessage());
	        }
	    }
	    
	    @Test
	    public void test2LowerBoundIsZero() {
	        try {
	            Range r1 = new Range(0, 0);
	            System.out.println("Test02: " + r1.getLowerBound());
	            assertEquals("The lower bound of Range(0,0) should be 0", 
	                    0, r1.getLowerBound(),0.000000001d); 
	        } catch (Exception e) {
	            fail("An error occurred: " + e.getMessage());
	        }
	    }
	    
	    @Test
	    public void test3LowerBoundIsPositive() {
	        try {
	            Range r1 = new Range(5.0, 10.0);
	            System.out.println("Test03: " + r1.getLowerBound());
	            assertEquals("The lower bound of Range(5.0, 10.0) should be 5.0", 
	                    5.0, r1.getLowerBound(),0.000000001d); 
	        } catch (Exception e) {
	            fail("An error occurred: " + e.getMessage());
	        }
	    }

}
