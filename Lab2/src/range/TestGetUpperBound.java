package range;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class TestGetUpperBound {

	@Before
	public void setUp() throws Exception {
	}

    @Test
    public void test1UpperBoundIsNegative() {
        try {
            Range r1 = new Range(-7.0,-5.0);
            System.out.println("Test01upper: " + r1.getLowerBound());
            assertEquals("The Upper bound of Range(-7.0,-5.0) should be -5.0", 
                    -5.0, r1.getUpperBound(),0.000000001d); 
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void test2UpperBoundIsZero() {
        try {
            Range r1 = new Range(-7.0,0);
            System.out.println("Test02upper: " + r1.getLowerBound());
            assertEquals("The Upper bound of Range(-7.0,0) should be 0", 
                    0, r1.getUpperBound(),0.000000001d); 
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void test3UpperBoundIsPositive() {
        try {
            Range r1 = new Range(-7.0,5.0);
            System.out.println("Test03upper: " + r1.getLowerBound());
            assertEquals("The Upper bound of Range(-7.0,5.0) should be 5.0", 
                    5.0, r1.getUpperBound(),0.000000001d); 
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }	

}
