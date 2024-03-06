package org.jfree.data.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import range.TestCombine;
import range.TestConstrain;
import range.TestGetLowerBound;
import range.TestGetUpperBound;
import range.TestToString;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestToString.class,
    TestGetUpperBound.class,
    TestGetLowerBound.class,
    TestConstrain.class,
    TestCombine.class,
})

public class RangeTest {

}
