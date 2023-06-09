import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void TestCase1() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        Assert.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1, 2};
        int[] input = {1,2};
        Assert.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void testCase3(){
        int[] expected = {1, 2};
        int[] input = {2, 1};
        Assert.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void testCase4(){
        int[] expected = {1, 2, 3};
        int[] input = {1, 2, 3};
        Assert.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void testCase5(){
        int[] expected = {-10, -7, -7, -6, -6, -5, -5, -4, -4, -4, -2, -1, 1, 3, 5, 5, 6, 8, 8, 10};
        int[] input = {-4, 5, 10, 8, -10, -6, -4, -2, -5, 3, 5, -4, -5, -1, 1, 6, -7, -6, -7, 8};
        Assert.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void testCase6(){
        int[] expected = {-10, -10, -9, -7, -7, -6, -5, -2, 2, 2, 3, 3, 4, 5, 8, 8, 9, 10};
        int[] input = {-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8};
        Assert.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    @Test
    public void testCase7(){
        int[] expected = {-10, -10, -9, -6, -5, -2, -2, -1, 1, 2, 4, 4, 6, 7, 7, 8, 8, 8, 8, 9, 10, 10};
        int[] input = {8, -6, 7, 10, 8, -1, 6, 2, 4, -5, 1, 10, 8, -10, -9, -10, 8, 9, -2, 7, -2, 4};
        Assert.assertTrue(compare(QuickSort.quickSort(input), expected));
    }

    public boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
