package kfiore;

import Main.Container;
import Main.MyHashMap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class AppTest {

    /**
     * All variables required listed here
     */

    MyHashMap map;
    Container container;

    /**
     * Build first two parts before running test
     */

    @Before
    public void setUpOneAndTwo() {
        this.container = new Container("Test");
        this.map = new MyHashMap();
    }

    /**
     * Test if all three parts are functioning as required
     */

    @Test
    public void testPartOne() {
        assertNotNull("Part One did not pass", container);
    }

    @Test
    public void testPartTwo() {
        assertNotNull("Part Two did not pass", map);
    }

    /**
     * Test to check if the expected array is returning the actual result
     */

    @Test
    public void partThree() {

            int[] expectedInt = { 1, 2, 3};
            String[] expectedString = { "Hello", "World"};

            int[] actualInt = { 1, 2, 3};
            String[] actualString = { "Hello", "World"};

            assertArrayEquals(expectedInt, actualInt);
            assertArrayEquals(expectedString, actualString);

        }
}
