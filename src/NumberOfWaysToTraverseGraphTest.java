import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysToTraverseGraphTest {

    @Test
    public void TestCase1() {
        int width = 4;
        int height = 3;
        int expected = 10;
        var actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphRecursive(width, height);
        Assert.assertEquals(expected, actual);
        actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphIterative(width, height);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        int width = 3;
        int height = 2;
        int expected = 3;
        var actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphRecursive(width, height);
        Assert.assertEquals(expected, actual);
        actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphIterative(width, height);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        int width = 5;
        int height = 9;
        int expected = 495;
        var actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphRecursive(width, height);
        Assert.assertEquals(expected, actual);
        actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphIterative(width, height);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase4() {
        int width = 5;
        int height = 6;
        int expected = 126;
        var actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphRecursive(width, height);
        Assert.assertEquals(expected, actual);
        actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphIterative(width, height);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestCase5() {
        int width = 6;
        int height = 7;
        int expected = 462;
        var actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphRecursive(width, height);
        Assert.assertEquals(expected, actual);
        actual = NumberOfWaysToTraverseGraph.numberOfWaysToTraverseGraphIterative(width, height);
        Assert.assertEquals(expected, actual);
    }
}
