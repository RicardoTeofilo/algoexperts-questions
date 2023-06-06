import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ThreeNumberSortTest {

    @Test
    public void TestCase1DoubleLoop() {
        var array = new int[] {1, 0, 0, -1, -1, 0, 1, 1};
        var order = new int[] {0, 1, -1};
        var expected = new int[] {0, 0, 0, 1, 1, 1, -1, -1};
        var actual = new ThreeNumberSort().threeNumberSort(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase1SingleLoop() {
        var array = new int[] {1, 0, 0, -1, -1, 0, 1, 1};
        var order = new int[] {0, 1, -1};
        var expected = new int[] {0, 0, 0, 1, 1, 1, -1, -1};
        var actual = new ThreeNumberSort().threeNumberSortSingleLoop(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase2DoubleLoop() {
        var array = new int[] {7, 8, 9, 7, 8, 9, 9, 9, 9, 9, 9, 9};
        var order = new int[] {8, 7, 9};
        var expected = new int[] {8, 8, 7, 7, 9, 9, 9, 9, 9, 9, 9, 9};
        var actual = new ThreeNumberSort().threeNumberSort(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase2SingleLoop() {
        var array = new int[] {7, 8, 9, 7, 8, 9, 9, 9, 9, 9, 9, 9};
        var order = new int[] {8, 7, 9};
        var expected = new int[] {8, 8, 7, 7, 9, 9, 9, 9, 9, 9, 9, 9};
        var actual = new ThreeNumberSort().threeNumberSortSingleLoop(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase3DoubleLoop() {
        var array = new int[] {};
        var order = new int[] {0, 7, 9};
        var expected = new int[] {};
        var actual = new ThreeNumberSort().threeNumberSort(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase3SingleLoop() {
        var array = new int[] {};
        var order = new int[] {0, 7, 9};
        var expected = new int[] {};
        var actual = new ThreeNumberSort().threeNumberSortSingleLoop(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase4DoubleLoop() {
        var array = new int[] {-2, -3, -3, -3, -3, -3, -2, -2, -3};
        var order = new int[] {-2, -3, 0};
        var expected = new int[] {-2, -2, -2, -3, -3, -3, -3, -3, -3};
        var actual = new ThreeNumberSort().threeNumberSort(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase4SingleLoop() {
        var array = new int[] {-2, -3, -3, -3, -3, -3, -2, -2, -3};
        var order = new int[] {-2, -3, 0};
        var expected = new int[] {-2, -2, -2, -3, -3, -3, -3, -3, -3};
        var actual = new ThreeNumberSort().threeNumberSortSingleLoop(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase5DoubleLoop() {
        var array = new int[] {0, 10, 10, 10, 10, 10, 25, 25, 25, 25, 25};
        var order = new int[] {25, 10, 0};
        var expected = new int[] {25, 25, 25, 25, 25, 10, 10, 10, 10, 10, 0};
        var actual = new ThreeNumberSort().threeNumberSort(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase5SingleLoop() {
        var array = new int[] {0, 10, 10, 10, 10, 10, 25, 25, 25, 25, 25};
        var order = new int[] {25, 10, 0};
        var expected = new int[] {25, 25, 25, 25, 25, 10, 10, 10, 10, 10, 0};
        var actual = new ThreeNumberSort().threeNumberSortSingleLoop(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase6DoubleLoop() {
        var array = new int[] {1, 3, 4, 4, 4, 4, 3, 3, 3, 4, 1, 1, 1, 4, 4, 1, 3, 1, 4, 4};
        var order = new int[] {1, 4, 3};
        var expected = new int[] {1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3};
        var actual = new ThreeNumberSort().threeNumberSort(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase6SingleLoop() {
        var array = new int[] {1, 3, 4, 4, 4, 4, 3, 3, 3, 4, 1, 1, 1, 4, 4, 1, 3, 1, 4, 4};
        var order = new int[] {1, 4, 3};
        var expected = new int[] {1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3};
        var actual = new ThreeNumberSort().threeNumberSortSingleLoop(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }
}
