package range;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class TestCombine {

	@Before
	public void setUp() throws Exception {
	}

	@Test
    public void test01Range1NegativeRange2Negative() {
        try {
            Range r1 = new Range(-5.0, -3.0);
            Range r2 = new Range(-5.0, -3.0);
            assertEquals("The combined range of Range(-5.0,-3.0) and Range(-5.0,-3.0) should be Range[-5.0,-3.0]", 
                    "Range[-5.0,-3.0]", Range.combine(r1, r2).toString()); 
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test02Range1NegativeRange2Mixed() {
        try {
            Range r1 = new Range(-5.0, -3.0);
            Range r2 = new Range(-3.0, 3.0);
            assertEquals("The combined range should be Range[-5.0,3.0]", 
                    "Range[-5.0,3.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test03Range1NegativeRange2Positive() {
        try {
            Range r1 = new Range(-5.0, -3.0);
            Range r2 = new Range(3.0, 5.0);
            assertEquals("The combined range should be Range[-5.0,5.0]", 
                    "Range[-5.0,5.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test04Range1NegativeRange2Null() {
        try {
            Range r1 = new Range(-5.0, -3.0);
            Range r2 = null;
            assertEquals("The combined range should be Range[-5.0,-3.0]", 
                    "Range[-5.0,-3.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test05Range1MixedRange2Negative() {
        try {
            Range r1 = new Range(-3.0, 3.0);
            Range r2 = new Range(-5.0, -3.0);
            assertEquals("The combined range should be Range[-5.0,3.0]", 
                    "Range[-5.0,3.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test06Range1MixedRange2Mixed() {
        try {
            Range r1 = new Range(-3.0, 3.0);
            Range r2 = new Range(-3.0, 3.0);
            assertEquals("The combined range should be Range[-3.0,3.0]", 
                    "Range[-3.0,3.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test07Range1MixedRange2Positive() {
        try {
            Range r1 = new Range(-3.0, 3.0);
            Range r2 = new Range(3.0, 5.0);
            assertEquals("The combined range should be Range[-3.0,5.0]", 
                    "Range[-3.0,5.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test08Range1MixedRange2Null() {
        try {
            Range r1 = new Range(-3.0, 3.0);
            Range r2 = null;
            assertEquals("The combined range should be Range[-3.0,3.0]", 
                    "Range[-3.0,3.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test09Range1PositiveRange2Negative() {
        try {
            Range r1 = new Range(3.0, 5.0);
            Range r2 = new Range(-5.0, -3.0);
            assertEquals("The combined range should be Range[-5.0,5.0]", 
                    "Range[-5.0,5.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test10Range1PositiveRange2Mixed() {
        try {
            Range r1 = new Range(3.0, 5.0);
            Range r2 = new Range(-3.0, 3.0);
            assertEquals("The combined range should be Range[-3.0,5.0]", 
                    "Range[-3.0,5.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test11Range1PositiveRange2Positive() {
        try {
            Range r1 = new Range(3.0, 5.0);
            Range r2 = new Range(3.0, 5.0);
            assertEquals("The combined range should be Range[3.0,5.0]", 
                    "Range[3.0,5.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test12Range1PositiveRange2Null() {
        try {
            Range r1 = new Range(3.0, 5.0);
            Range r2 = null;
            assertEquals("The combined range should be Range[3.0,5.0]", 
                    "Range[3.0,5.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test13Range1NullRange2Negative() {
        try {
            Range r1 = null;
            Range r2 = new Range(-5.0, -3.0);
            assertEquals("The combined range of null and Range(-5.0,-3.0) should be Range[-5.0,-3.0]", 
                    "Range[-5.0,-3.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test14Range1NullRange2Mixed() {
        try {
            Range r1 = null;
            Range r2 = new Range(-3.0, 3.0);
            assertEquals("The combined range of null and Range(-3.0,3.0) should be Range[-3.0,3.0]", 
                    "Range[-3.0,3.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test15Range1NullRange2Positive() {
        try {
            Range r1 = null;
            Range r2 = new Range(3.0, 5.0);
            assertEquals("The combined range of null and Range(3.0,5.0) should be Range[3.0,5.0]", 
                    "Range[3.0,5.0]", Range.combine(r1, r2).toString());
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test16Range1NullRange2Null() {
        try {
            Range r1 = null;
            Range r2 = null;
            assertEquals("The combined range of null and null should be null", 
                    null, Range.combine(r1, r2)); 
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
}
