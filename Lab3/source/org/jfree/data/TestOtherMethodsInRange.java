package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;
import org.w3c.dom.ranges.RangeException;

public class TestOtherMethodsInRange {

	// tests for getLength() method
	@Test
	public void testGetLength() {
        try {
        	Range r = new Range(-1, 1);
            assertEquals("The output should be 1.0", 2.0 , r.getLength(), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	// tests for getCentralValue() method
	@Test
	public void testGetCentralValue() {
        try {
        	Range r = new Range(-1, 1);
            assertEquals("The output should be 0.0", 0.0 , r.getCentralValue(), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	// tests for intersects(double lower, double upper) method
	@Test
	public void testIntersectsIfBranchReturnT() {
        try {
        	Range r = new Range(-1, 1);
            assertEquals("The output should true", true , r.intersects(-2.0,1.0));
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testIntersectsIfBranchReturnF() {
        try {
        	Range r = new Range(-1, 1);
            assertEquals("The output should false", false , r.intersects(-2.0,-4.0));
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testIntersectsElseBranchReturnTT() {
        try {
        	Range r = new Range(-1, 1);
            assertEquals("The output should true", true , r.intersects(0,0));
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testIntersectsElseBranchTF() {
        try {
        	Range r = new Range(-1, 1);
            assertEquals("The output should false", false , r.intersects(1.0,0));
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testIntersectsElseBranchFT() {
        try {
        	Range r = new Range(-1, 1);
            assertEquals("The output should false", false , r.intersects(1.0,2.0));
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testIntersectsElseBranchFF() {
        try {
        	Range r = new Range(-1, 1);
            assertEquals("The output should false", false , r.intersects(3.0,2.0));
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}

	// tests for expandToInclude() method
	@Test
	public void testExpandToIncludeBranch1() {
        try {
        	Range r = null;
        	Range actual = Range.expandToInclude(r, 1);
            assertEquals("The output should Range[1.0,1.0]", "Range[1.0,1.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testExpandToIncludeBranch2() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range actual = Range.expandToInclude(r, -2);
            assertEquals("The output should Range[-2.0,1.0]", "Range[-2.0,1.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testExpandToIncludeBranch3() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range actual = Range.expandToInclude(r, 2);
            assertEquals("The output should Range[-1.0,2.0]", "Range[-1.0,2.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testExpandToIncludeBranch4() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range actual = Range.expandToInclude(r, 1);
            assertEquals("The output should Range[-1.0,1.0]", "Range[-1.0,1.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	// tests for expand(Range range, double lowerMargin, double upperMargin) method
	@Test
	public void testExpandRangeWhereRangeIsNull() {
        try {
        	Range r = null;
        	Range actual = Range.expand(r, -2.0, 2.0);
            fail("the test should throw an Exception");
        } catch (Exception e) {
        	assertEquals("The error message is not as expected" ,"Null 'range' argument.",e.getMessage());
        }
	}
	
	@Test
	public void testExpandRangeWhereRangeIsNotNull() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range actual = Range.expand(r, 1.0, 1.0);
            assertEquals("The output should Range[-3.0,3.0]", "Range[-3.0,3.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	// tests for shift() method 
	@Test
	public void testShiftAllowZeroCrossing() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range actual = Range.shift(r, 1, true);
            assertEquals("The output should Range[0.0,2.0]", "Range[0.0,2.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}

	@Test
	public void testShiftNotAllowingZeroCrossingBranch1() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range actual = Range.shift(r, 1, false);
            assertEquals("The output should Range[0.0,2.0]", "Range[0.0,2.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testShiftNotAllowingZeroCrossingBranch2() {
        try {
        	Range r = new Range(0.0, 1.0);
        	Range actual = Range.shift(r, 1, false);
            assertEquals("The output should Range[1.0,2.0]", "Range[1.0,2.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testShiftDefaultNotAllowingZeroCrossing() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range actual = Range.shift(r, 1);
            assertEquals("The output should Range[0.0,2.0]", "Range[0.0,2.0]" , actual.toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	// tests for equals(Object obj) method 
	@Test
	public void testEqualsObjNotInstanceOfRange() {
        try {
        	//Range r = new Range(-1.0, 1.0);
        	boolean actual = equals(null);
            assertEquals("The output should false", false , actual);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testEqualsLowerBoundIsNotEqual() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range input = new Range(-2.0, 1.0);
        	boolean actual = r.equals(input);
            assertEquals("The output should false", false , actual);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testEqualsUpperBoundIsNotEqual() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range input = new Range(-1.0, 2.0);
        	boolean actual = r.equals(input);
            assertEquals("The output should false", false , actual);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	@Test
	public void testEqualsLowerAndUpperEqualRange() {
        try {
        	Range r = new Range(-1.0, 1.0);
        	Range input = new Range(-1.0, 1.0);
			boolean actual = r.equals(input);
            assertEquals("The output should true", true , actual);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
	
	// tests for hashCode method 
	@Test
	public void testHashCode() {
        try {
        	Range r = new Range(-1.0, 1.0);
			int actual = r.hashCode();
			System.out.println(actual);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
	}
}
