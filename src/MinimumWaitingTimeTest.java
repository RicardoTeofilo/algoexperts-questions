import org.junit.Assert;
import org.junit.Test;

public class MinimumWaitingTimeTest {

    @Test
    public void TestCase1() {
        int[] queries = new int[] {3, 2, 1, 2, 6};
        int expected = 17;
        var actual =  MinimumWaitingTime.minimumWaitingTime(queries);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        int[] queries = new int[] {2, 1, 1, 1};
        int expected = 6;
        var actual =  MinimumWaitingTime.minimumWaitingTime(queries);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        int[] queries = new int[] {1, 2, 4, 5, 2, 1};
        int expected = 23;
        var actual =  MinimumWaitingTime.minimumWaitingTime(queries);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase4() {
        int[] queries = new int[] {7, 9, 2, 3};
        int expected = 19;
        var actual =  MinimumWaitingTime.minimumWaitingTime(queries);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase5() {
        int[] queries = new int[] {2};
        int expected = 0;
        var actual =  MinimumWaitingTime.minimumWaitingTime(queries);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase6() {
        int[] queries = new int[] {5, 4, 3, 2, 1};
        int expected = 20;
        var actual =  MinimumWaitingTime.minimumWaitingTime(queries);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase7() {
        int[] queries = new int[] {1, 1, 1, 4, 5, 6, 8, 1, 1, 2, 1};
        int expected = 81;
        var actual =  MinimumWaitingTime.minimumWaitingTime(queries);
        Assert.assertEquals(expected, actual);
    }
}
