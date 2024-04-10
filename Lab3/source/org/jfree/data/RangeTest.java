package org.jfree.data;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestToString.class,
    TestGetUpperBound.class,
    TestGetLowerBound.class,
    TestConstrain.class,
    TestCombine.class,
    TestOtherMethodsInRange.class
})

public class RangeTest {

}
