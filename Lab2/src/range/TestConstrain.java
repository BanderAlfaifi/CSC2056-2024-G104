package range;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConstrain {
	private Range r;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		r = new Range(-3.0, 3.0);
	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
    public void test01MinMinusOne() {
        try {
            assertEquals("The output should be -3.0", -3.0 , r.constrain(-4.0), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void test02Min() {
        try {
            assertEquals("The output should be -3.0", -3.0 , r.constrain(-3.0), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void test03MinPlusOne() {
        try {
            assertEquals("The output should be -3.0", -3.0 , r.constrain(-2.0), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void test04Normal() {
        try {
            assertEquals("The output should be 0.0", 0.0 , r.constrain(0.0), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void test05MaxMinusOne() {
        try {
            assertEquals("The output should be 3.0", 3.0 , r.constrain(2.0), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void test06Max() {
        try {
            assertEquals("The output should be 3.0", 3.0 , r.constrain(3.0), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void test07MaxPlusOne() {
        try {
            assertEquals("The output should be 3.0", 3.0 , r.constrain(4.0), 0.0000001d);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
}
