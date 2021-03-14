package JUnit;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JunitTestBeforeAfterClass {

        @BeforeClass
        public static void beforeTest() {
            System.out.println("Before Test");
        }

        @Test
        public void test_add_positive() {
            Addition app1 = new Addition();
            assertEquals(10, app1.add(5, 5));
            assertEquals(50, app1.add(45, 5));
            assertNotEquals(500, app1.add(250, 249));
            System.out.println("Running addition test for positive numbers");
        }

        @Test
        public void test_add_negative() {
            Addition app1 = new Addition();
            assertEquals(-10, app1.add(-5, -5));
            assertEquals(-500, app1.add(-450, -50));
            System.out.println("Running addition test for negative numbers");
        }

        @AfterClass
        public static void afterTest() {
            System.out.println("After Test");
        }

}
