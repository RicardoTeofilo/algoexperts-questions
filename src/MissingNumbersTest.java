import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MissingNumbersTest {

    @Test
    public void TestCase1() {
        var input = new int[] {4, 5, 1, 3};
        var expected = new int[] {2, 6};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase2() {
        var input = new int[] {1};
        var expected = new int[] {2, 3};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase3() {
        var input = new int[] {2};
        var expected = new int[] {1, 3};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase4() {
        var input = new int[] {1, 3};
        var expected = new int[] {2, 4};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase5() {
        var input = new int[] {1, 2, 3};
        var expected = new int[] {4, 5};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase6() {
        var input = new int[] {3, 4, 5};
        var expected = new int[] {1, 2};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase7() {
        var input = new int[] {1, 2, 4, 5, 7};
        var expected = new int[] {3, 6};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase8() {
        var input = new int[] {1, 2, 3, 4, 5, 6, 7};
        var expected = new int[] {8, 9};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase9() {
        var input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 20, 21, 22};
        var expected = new int[] {14, 19};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }

    @Test
    public void TestCase10() {
        var input = new int[] {3, 5, 7, 8, 1, 10, 11, 2, 4, 13, 17, 22, 18, 21, 16, 20, 6, 9, 15, 12};
        var expected = new int[] {14, 19};
        var actual = new MissingNumbers().missingNumbers(input);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }
}
