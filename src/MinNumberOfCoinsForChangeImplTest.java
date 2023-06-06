import org.junit.Assert;
import org.junit.Test;

public class MinNumberOfCoinsForChangeImplTest {

    @Test
    public void TestCase1() {
        int[] input = {1, 5, 10};
        Assert.assertTrue(MinNumberOfCoinsForChangeImpl.minNumberOfCoinsForChange(7, input) == 3);
    }

    @Test
    public void TestCase2() {
        int[] input = {1, 5, 10};
        Assert.assertTrue(
                MinNumberOfCoinsForChangeImpl.minNumberOfCoinsForChange(27, input) == 5);
    }

    @Test
    public void TestCase3() {
        int[] input = {2, 4};
        Assert.assertTrue(
                MinNumberOfCoinsForChangeImpl.minNumberOfCoinsForChange(7, input) == -1);
    }

    @Test
    public void TestCase4() {
        int[] input = {3, 5};
        Assert.assertEquals(3, MinNumberOfCoinsForChangeImpl.minNumberOfCoinsForChange(9, input));
    }

    @Test
    public void TestCase5() {
        int[] input = {39, 45, 130, 40, 4, 1, 60, 75};
        Assert.assertEquals(2, MinNumberOfCoinsForChangeImpl.minNumberOfCoinsForChange(135, input));
    }

    @Test
    public void TestCase6() {
        int[] input = {1, 3, 4};
        Assert.assertEquals(3, MinNumberOfCoinsForChangeImpl.findMinNumberOfCoins(10, input));
    }


    @Test
    public void TestCase7() {
        int[] input = {2, 4};
        Assert.assertEquals(-1, MinNumberOfCoinsForChangeImpl.findMinNumberOfCoins(7, input));
    }

    @Test
    public void TestCase8() {
        int[] input = {3, 5};
        Assert.assertEquals(3, MinNumberOfCoinsForChangeImpl.findMinNumberOfCoins(9, input));
    }
}
