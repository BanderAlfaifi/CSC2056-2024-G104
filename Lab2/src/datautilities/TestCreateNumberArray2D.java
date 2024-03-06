package datautilities;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Before;
import org.junit.Test;

public class TestCreateNumberArray2D {

	@Before
	public void setUp() throws Exception {
	}

    @Test
    public void test01FirstAllNegSecondAllNeg() {
        double[][] double2DArray = {{-1.0, -2.0, -3.0}, {-1.0, -2.0, -3.0}};
        try {
            Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
            for (int i = 0; i < numArrayNumbers.length; i++) {
                for (int j = 0; j < numArrayNumbers[i].length; j++) {
                    assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
                }
            }
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test02FirstAllNegSecondAllZero() {
        double[][] double2DArray = {{-1.0, -2.0, -3.0}, {0.0, 0.0, 0.0}};
        try {
            Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
            for (int i = 0; i < numArrayNumbers.length; i++) {
                for (int j = 0; j < numArrayNumbers[i].length; j++) {
                    assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
                }
            }
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test03FirstAllNegSecondAllPos() {
        double[][] double2DArray = {{-1.0, -2.0, -3.0}, {1.0, 2.0, 3.0}};
        try {
            Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
            for (int i = 0; i < numArrayNumbers.length; i++) {
                for (int j = 0; j < numArrayNumbers[i].length; j++) {
                    assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
                }
            }
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test04FirstAllNegSecondMixed() {
        double[][] double2DArray = {{-1.0, -2.0, -3.0}, {-1.0, 0.0, 1.0}};
        try {
            Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
            for (int i = 0; i < numArrayNumbers.length; i++) {
                for (int j = 0; j < numArrayNumbers[i].length; j++) {
                    assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
                }
            }
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

    @Test
    public void test05FirstAllNegSecondEmpty() {
        double[][] double2DArray = {{-1.0, -2.0, -3.0}, {}};
        try {
            Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
            assertEquals("First array should have 3 elements", 3, numArrayNumbers[0].length);
            assertEquals("Second array should be empty", 0, numArrayNumbers[1].length);
        } catch (Exception e) {
            fail("An error occurred: " + e.getMessage());
        }
    }

	@Test
	public void test06FirstAllZeroSecondAllNeg() {
	    double[][] double2DArray = {{0.0, 0.0, 0.0}, {-1.0, -2.0, -3.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test07FirstAllZeroSecondAllZero() {
	    double[][] double2DArray = {{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test08FirstAllZeroSecondAllPos() {
	    double[][] double2DArray = {{0.0, 0.0, 0.0}, {1.0, 2.0, 3.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test09FirstAllZeroSecondMixed() {
	    double[][] double2DArray = {{0.0, 0.0, 0.0}, {-1.0, 0.0, 1.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test10FirstAllZeroSecondEmpty() {
	    double[][] double2DArray = {{0.0, 0.0, 0.0}, {}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        assertEquals("First array should have 3 elements", 3, numArrayNumbers[0].length);
	        assertEquals("Second array should be empty", 0, numArrayNumbers[1].length);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test11FirstAllPosSecondAllNeg() {
	    double[][] double2DArray = {{1.0, 2.0, 3.0}, {-1.0, -2.0, -3.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test12FirstAllPosSecondAllZero() {
	    double[][] double2DArray = {{1.0, 2.0, 3.0}, {0.0, 0.0, 0.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test13FirstAllPosSecondAllPos() {
	    double[][] double2DArray = {{1.0, 2.0, 3.0}, {1.0, 2.0, 3.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test14FirstAllPosSecondMixed() {
	    double[][] double2DArray = {{1.0, 2.0, 3.0}, {-1.0, 0.0, 1.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test15FirstAllPosSecondEmpty() {
	    double[][] double2DArray = {{1.0, 2.0, 3.0}, {}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        assertEquals("First array should have 3 elements", 3, numArrayNumbers[0].length);
	        assertEquals("Second array should be empty", 0, numArrayNumbers[1].length);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test16FirstMixedSecondAllNeg() {
	    double[][] double2DArray = {{-1.0, 0.0, 1.0}, {-1.0, -2.0, -3.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test17FirstMixedSecondAllZero() {
	    double[][] double2DArray = {{-1.0, 0.0, 1.0}, {0.0, 0.0, 0.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test18FirstMixedSecondAllPos() {
	    double[][] double2DArray = {{-1.0, 0.0, 1.0}, {1.0, 2.0, 3.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test19FirstMixedSecondMixed() {
	    double[][] double2DArray = {{-1.0, 0.0, 1.0}, {-1.0, 0.0, 1.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        for (int i = 0; i < numArrayNumbers.length; i++) {
	            for (int j = 0; j < numArrayNumbers[i].length; j++) {
	                assertEquals("Mismatch at [" + i + "][" + j + "]", double2DArray[i][j], numArrayNumbers[i][j].doubleValue(), 0.00001);
	            }
	        }
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test20FirstMixedSecondEmpty() {
	    double[][] double2DArray = {{-1.0, 0.0, 1.0}, {}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        assertEquals("First array should have 3 elements", 3, numArrayNumbers[0].length);
	        assertEquals("Second array should be empty", 0, numArrayNumbers[1].length);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test21EmptyFirstAllNegSecond() {
	    double[][] double2DArray = {{}, {-1.0, -2.0, -3.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        assertEquals("First array should be empty", 0, numArrayNumbers[0].length);
	        assertEquals("Second array should have 3 elements", 3, numArrayNumbers[1].length);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test22EmptyFirstAllZeroSecond() {
	    double[][] double2DArray = {{}, {0.0, 0.0, 0.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        assertEquals("First array should be empty", 0, numArrayNumbers[0].length);
	        assertEquals("Second array should have 3 zero elements", 3, numArrayNumbers[1].length);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test23EmptyFirstAllPosSecond() {
	    double[][] double2DArray = {{}, {1.0, 2.0, 3.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        assertEquals("First array should be empty", 0, numArrayNumbers[0].length);
	        assertEquals("Second array should have 3 positive elements", 3, numArrayNumbers[1].length);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test24EmptyFirstMixedSecond() {
	    double[][] double2DArray = {{}, {-1.0, 0.0, 1.0}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        assertEquals("First array should be empty", 0, numArrayNumbers[0].length);
	        assertEquals("Second array should have mixed elements", 3, numArrayNumbers[1].length);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}

	@Test
	public void test25EmptyArrayEmptyArray() {
	    double[][] double2DArray = {{}, {}};
	    try {
	        Number[][] numArrayNumbers = DataUtilities.createNumberArray2D(double2DArray);
	        assertEquals("Both arrays should be empty", 0, numArrayNumbers[0].length);
	        assertEquals("Both arrays should be empty", 0, numArrayNumbers[1].length);
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
	}



}
