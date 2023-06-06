import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ZeroSumSubarrayTest {

    @Test
    public void TestCase1() {
        var input = new int[] {4, 2, -1, -1, 3};
        var expected = true;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase2() {
        var input = new int[] {};
        var expected = false;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase3() {
        var input = new int[] {0};
        var expected = true;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase4() {
        var input = new int[] {1, 1, 1};
        var expected = false;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase5() {
        var input = new int[] {1, 2, -2, 3};
        var expected = true;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase6() {
        var input = new int[] {2, -2};
        var expected = true;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase7() {
        var input = new int[] {-1, 2, 3, 4, -5, -3, 1, 2};
        var expected = true;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase8() {
        var input = new int[] {2, 3, 4, -5, -3, 4, 5};
        var expected = true;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase9() {
        var input = new int[] {2, 3, 4, -5, -3, 5, 5};
        var expected = false;
        var actual = new ZeroSumSubarray().zeroSumSubarray(input);
        assertTrue(expected == actual);
    }


}
