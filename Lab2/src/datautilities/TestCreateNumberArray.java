package datautilities;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Before;
import org.junit.Test;

public class TestCreateNumberArray {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test01AllNegativeValues() {
		try {
			double[] doubleArray = {-1.0,-2.0,-3.0};
			Number[] numArrayNumbers = DataUtilities.createNumberArray(doubleArray);
			for (int i = 0; i <= numArrayNumbers.length -1; i++) {
				assertEquals("The output should be " + doubleArray[i],  Double.toString(doubleArray[i]) , numArrayNumbers[i].toString());
			}
		} catch (Exception e) {
			fail("An error occurred: " + e.getMessage());
		}
	}
	
	@Test
	public void test02AllZeroValues() {
		try {
			double[] doubleArray = {0.0,0.0,0.0};
			Number[] numArrayNumbers = DataUtilities.createNumberArray(doubleArray);
			for (int i = 0; i <= numArrayNumbers.length -1; i++) {
				assertEquals("The output should be " + doubleArray[i],  Double.toString(doubleArray[i]) , numArrayNumbers[i].toString());
			}
		} catch (Exception e) {
			fail("An error occurred: " + e.getMessage());
		}
	}
	
	@Test
	public void test03AllPositiveValues() {
		try {
			double[] doubleArray = {1.0,2.0,3.0};
			Number[] numArrayNumbers = DataUtilities.createNumberArray(doubleArray);
			for (int i = 0; i <= numArrayNumbers.length -1; i++) {
				assertEquals("The output should be " + doubleArray[i],  Double.toString(doubleArray[i]) , numArrayNumbers[i].toString());
			}
		} catch (Exception e) {
			fail("An error occurred: " + e.getMessage());
		}
	}
	
	@Test
	public void test04MixedValues() {
		try {
			double[] doubleArray = {-1.0,0.0,1.0};
			Number[] numArrayNumbers = DataUtilities.createNumberArray(doubleArray);
			for (int i = 0; i <= numArrayNumbers.length -1; i++) {
				assertEquals("The output should be " + doubleArray[i],  Double.toString(doubleArray[i]) , numArrayNumbers[i].toString());
			}
		} catch (Exception e) {
			fail("An error occurred: " + e.getMessage());
		}
	}
	
	@Test
	public void test05EmptyArray() {
		try {
			double[] doubleArray = {};
			Number[] numArrayNumbers = DataUtilities.createNumberArray(doubleArray);
			assertEquals("The output should be 0", 0,  numArrayNumbers.length);
		} catch (Exception e) {
			fail("An error occurred: " + e.getMessage());
		}
	}
	

}
