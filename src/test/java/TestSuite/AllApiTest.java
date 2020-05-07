package TestSuite;

import ApiTests.BasicApiTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicApiTest.class,
})
public class AllApiTest {
}