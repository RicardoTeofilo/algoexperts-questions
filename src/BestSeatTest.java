import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BestSeatTest {

    @Test
    public void TestCase1() {
        var input = new int[] {1, 0, 1, 0, 0, 0, 1};
        var expected = 4;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase2() {
        var input = new int[] {1};
        var expected = -1;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase3() {
        var input = new int[] {1, 0, 1};
        var expected = 1;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase4() {
        var input = new int[] {1, 0, 0, 1};
        var expected = 1;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase5() {
        var input = new int[] {1, 0, 0, 1, 0, 0, 1};
        var expected = 1;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase6() {
        var input = new int[] {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1};
        var expected = 3;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase7() {
        var input = new int[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1};
        var expected = 4;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase8() {
        var input = new int[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1};
        var expected = 4;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase9() {
        var input = new int[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        var expected = 13;
        var actual = new BestSeat().bestSeat(input);
        assertTrue(expected == actual);
    }


}
