package org.jfree.data;

public class Main {
	public static void main(String[] args) {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		Values2D values2DEmpty = testValues;
		
		testValues.addValue(null, 0, 0); 
		testValues.addValue(2, 0, 1);
		testValues.addValue(3, 0, 2); 
		testValues.addValue(4, 0, 3);
		testValues.addValue(5, 0, 4);
		
		testValues.addValue(4, 1, 0); 
		testValues.addValue(5, 1, 1);
		testValues.addValue(6, 1, 2); 
		testValues.addValue(7, 1, 3);
		testValues.addValue(8, 1, 4);
		
		System.out.println(calculateColumnTotal(values2DEmpty, 0));

	}
	
    public static double calculateColumnTotal(Values2D data, int column) {
        double total = 0.0;
        int rowCount = data.getRowCount();
        for (int r = 0; r < rowCount; r++) {
            Number n = data.getValue(r, column);
            if (n != null) {
                total += n.doubleValue();   
            }
        }
        return total;
    }

}
