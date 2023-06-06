import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortImplTest {

    @Test
    public void TestCase1() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        int[] output = MergeSortImpl.mergeSort(input);
        Assert.assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {-10, -10, -9, -6, -5, -2, -2, -1, 1, 2, 4, 4, 6, 7, 7, 8, 8, 8, 8, 9, 10, 10};
        int[] input = {8, -6, 7, 10, 8, -1, 6, 2, 4, -5, 1, 10, 8, -10, -9, -10, 8, 9, -2, 7, -2, 4};
        int[] output = MergeSortImpl.mergeSort(input);
        Assert.assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {-9, -9, -9, -7, -7, -7, -4, -4, -3, -3, -3, -2, -1, 0, 1, 1, 3, 4, 4, 5, 8, 9};
        int[] input = {4, 1, 5, 0, -9, -3, -3, 9, 3, -4, -9, 8, 1, -3, -7, -4, -9, -1, -7, -2, -7, 4};
        int[] output = MergeSortImpl.mergeSort(input);
        Assert.assertTrue(compare(output, expected));
    }

    public boolean compare(int[] arr1, int[] arr2) {

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

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
