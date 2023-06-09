import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MaxSumIncreasingSubsequenceTest {

    @Test
    public void TestCase1() {
        int[] input = {10, 70, 20, 30, 50, 11, 30};
        int[][] expected = {{110}, {10, 20, 30, 50}};
        Assert.assertTrue(compare(MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(input), expected));
    }

    @Test
    public void TestCase2() {
        int[] input = {1};
        int[][] expected = {{1}, {1}};
        Assert.assertTrue(compare(MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(input), expected));
    }

    @Test
    public void TestCase3() {
        int[] input = {-1};
        int[][] expected = {{-1}, {-1}};
        Assert.assertTrue(compare(MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(input), expected));
    }

    @Test
    public void TestCase4() {
        int[] input = {-1, 1};
        int[][] expected = {{1}, {1}};
        Assert.assertTrue(compare(MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(input), expected));
    }

    @Test
    public void TestCase5() {
        int[] input = {5, 4, 3, 2, 1};
        int[][] expected = {{5}, {5}};
        Assert.assertTrue(compare(MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(input), expected));
    }

    @Test
    public void TestCase6() {
        int[] input = {1, 2, 3, 4, 5};
        int[][] expected = {{15}, {1, 2, 3, 4, 5}};
        Assert.assertTrue(compare(MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(input), expected));
    }

    public static boolean compare(List<List<Integer>> arr1, int[][] arr2) {
        if (arr1.get(0).get(0) != arr2[0][0]) {
            return false;
        }
        for (int i = 0; i < arr1.get(1).size(); i++) {
            if (arr1.get(1).get(i) != arr2[1][i]) {
                return false;
            }
        }
        return true;
    }
}
