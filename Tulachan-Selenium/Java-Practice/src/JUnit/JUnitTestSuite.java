package JUnit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JUnitTest.class,
        JunitTestBeforeAfterClass.class
})

public class JUnitTestSuite {

}
