package org.jfree.data.test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import datautilities.TestCalculateColumnTotal;
import datautilities.TestCalculateRowTotal;
import datautilities.TestCreateNumberArray;
import datautilities.TestCreateNumberArray2D;
import datautilities.TestGetCumulativePercentages;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestCalculateColumnTotal.class,
    TestCalculateRowTotal.class,
    TestCreateNumberArray.class,
    TestCreateNumberArray2D.class,
    TestGetCumulativePercentages.class,
})
public class DataUtilitiesTest {

}
