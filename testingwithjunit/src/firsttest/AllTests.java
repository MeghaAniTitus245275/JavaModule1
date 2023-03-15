package firsttest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testadd.class, TestCalculator.class, testsub.class })
public class AllTests {

}
