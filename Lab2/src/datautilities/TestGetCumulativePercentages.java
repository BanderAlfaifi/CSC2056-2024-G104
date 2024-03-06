package datautilities;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.KeyedValues;
import org.junit.Before;
import org.junit.Test;

public class TestGetCumulativePercentages {
	DefaultKeyedValues data;
	@Before
	public void setUp() throws Exception {
		 data = new DefaultKeyedValues();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
    @Test
    public void Test01SingleEntryPositveValue() {
	    try {
	    	data.addValue("item 1", 5);	
	        KeyedValues cumulativePercentages = DataUtilities.getCumulativePercentages(data);
            Comparable key = cumulativePercentages.getKey(0);
            Number actual = cumulativePercentages.getValue(key);
            System.out.println(actual.toString());
            assertEquals("The output should be 1.0", "1.0" , actual.toString());
			
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void Test02SingleEntryZeroValue() {
	    try {
	    	data.addValue("item 1", 0);	
	        KeyedValues cumulativePercentages = DataUtilities.getCumulativePercentages(data);
            Comparable key = cumulativePercentages.getKey(0);
            Number actual = cumulativePercentages.getValue(key);
            System.out.println(actual.toString());
            fail("No exception was thrown");
	    } catch (Exception e) {
	        
	    }
    }
    
    @Test
    public void Test03SingleEntryNegativeValue() {
	    try {
	    	data.addValue("item 1", -5);	
	        KeyedValues cumulativePercentages = DataUtilities.getCumulativePercentages(data);
            Comparable key = cumulativePercentages.getKey(0);
            Number actual = cumulativePercentages.getValue(key);
            System.out.println(actual.toString());
            assertEquals("The output should be 1.0", "1.0" , actual.toString());
			
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
   
    @Test
    public void Test05SingleEntryEmpty() {
	    try {
	        KeyedValues cumulativePercentages = DataUtilities.getCumulativePercentages(data);
            Comparable key = cumulativePercentages.getKey(0);
            Number actual = cumulativePercentages.getValue(key);
            fail("No exception was thrown");   
	    } catch (Exception e) {

	    }
    }
    
    @Test
    public void Test06MultipleEntriesPositveValues() {
	    try {
	    	data.addValue("item 1", 1);
	    	data.addValue("item 2", 3);	
	    	data.addValue("item 3", 5);	
	        KeyedValues cumulativePercentages = DataUtilities.getCumulativePercentages(data);
            double[] exp = {0.11,0.44,1.0};
          for (int i = 0; i < cumulativePercentages.getItemCount(); i++) {
	          Comparable key = cumulativePercentages.getKey(i);
	          Number actual = cumulativePercentages.getValue(key);
	          assertEquals("The output in index " + i + " is worng!", Double.toString(exp[i]) , actual.toString());
          }
			
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    }
    
    @Test
    public void Test07MultipleEntriesZeroValues() {
	    try {
	    	data.addValue("item 1", 0);
	    	data.addValue("item 2", 0);	
	    	data.addValue("item 3", 0);	
	        KeyedValues cumulativePercentages = DataUtilities.getCumulativePercentages(data);
            double[] exp = {0.11,0.44,1.0};
	          for (int i = 0; i < cumulativePercentages.getItemCount(); i++) {
		          Comparable key = cumulativePercentages.getKey(i);
		          Number actual = cumulativePercentages.getValue(key);
	          }
          fail("No exception was thrown");
	    } catch (Exception e) {
	      
	    }
    }
    
    @Test
    public void Test08MultipleEntriesNegativeValues() {
	    try {
	    	data.addValue("item 1", -1);
	    	data.addValue("item 2", -3);	
	    	data.addValue("item 3", -5);	
	        KeyedValues cumulativePercentages = DataUtilities.getCumulativePercentages(data);
            double[] exp = {0.11,0.44,1.0};
          for (int i = 0; i < cumulativePercentages.getItemCount(); i++) {
	          Comparable key = cumulativePercentages.getKey(i);
	          Number actual = cumulativePercentages.getValue(key);
	          assertEquals("The output in index " + i + " is worng!", Double.toString(exp[i]) , actual.toString());
          }
			
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    } 
    
    @Test
    public void Test09MultipleEntriesMixedValues() {
	    try {
	    	data.addValue("item 1", -3);
	    	data.addValue("item 2", 0);	
	    	data.addValue("item 3", 5);	
	        KeyedValues cumulativePercentages = DataUtilities.getCumulativePercentages(data);
            double[] exp = {0.11,0.44,1.0};
	          for (int i = 0; i < cumulativePercentages.getItemCount(); i++) {
		          Comparable key = cumulativePercentages.getKey(i);
		          Number actual = cumulativePercentages.getValue(key);
		          System.out.println(actual.toString());
	          }
          fail("No exception was thrown");
			
	    } catch (Exception e) {
	        fail("An error occurred: " + e.getMessage());
	    }
    } 

}
