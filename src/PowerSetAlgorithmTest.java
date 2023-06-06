import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class PowerSetAlgorithmTest {

    @Test
    public void TestPowerSetBinary1() {
        List<List<Integer>> output = PowerSetAlgorithm.powerset(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        assertTrue(output.size() == 8);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));
    }

    @Test
    public void TestPowerSetBinary2() {
        List<List<Integer>> output = PowerSetAlgorithm.powerset(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
        assertTrue(output.size() == 16);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));

        assertTrue(contains(output, new int[] {4}));
        assertTrue(contains(output, new int[] {1, 4}));
        assertTrue(contains(output, new int[] {2, 4}));
        assertTrue(contains(output, new int[] {1, 2, 4}));
        assertTrue(contains(output, new int[] {3, 4}));
        assertTrue(contains(output, new int[] {1, 3, 4}));
        assertTrue(contains(output, new int[] {2, 3, 4}));
        assertTrue(contains(output, new int[] {1, 2, 3, 4}));
    }

    @Test
    public void TestPowerSetRecursive1() {
        List<List<Integer>> output = PowerSetAlgorithm.powersetRecursive(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        assertTrue(output.size() == 8);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));
    }

    @Test
    public void TestPowerSetRecursive2() {
        List<List<Integer>> output = PowerSetAlgorithm.powersetRecursive(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
        assertTrue(output.size() == 16);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));

        assertTrue(contains(output, new int[] {4}));
        assertTrue(contains(output, new int[] {1, 4}));
        assertTrue(contains(output, new int[] {2, 4}));
        assertTrue(contains(output, new int[] {1, 2, 4}));
        assertTrue(contains(output, new int[] {3, 4}));
        assertTrue(contains(output, new int[] {1, 3, 4}));
        assertTrue(contains(output, new int[] {2, 3, 4}));
        assertTrue(contains(output, new int[] {1, 2, 3, 4}));
    }

    @Test
    public void TestPowerSetRecursive3() {
        List<List<Integer>> output = PowerSetAlgorithm.powersetRecursive(new ArrayList<Integer>(Arrays.asList()));
        assertTrue(output.size() == 1);
        assertTrue(contains(output, new int[] {}));

    }
    @Test
    public void TestPowerSetIterative1() {
        List<List<Integer>> output = PowerSetAlgorithm.powersetIterative(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        assertTrue(output.size() == 8);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));
    }

    @Test
    public void TestPowerSetIterative2() {
        List<List<Integer>> output = PowerSetAlgorithm.powersetIterative(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
        assertTrue(output.size() == 16);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));

        assertTrue(contains(output, new int[] {4}));
        assertTrue(contains(output, new int[] {1, 4}));
        assertTrue(contains(output, new int[] {2, 4}));
        assertTrue(contains(output, new int[] {1, 2, 4}));
        assertTrue(contains(output, new int[] {3, 4}));
        assertTrue(contains(output, new int[] {1, 3, 4}));
        assertTrue(contains(output, new int[] {2, 3, 4}));
        assertTrue(contains(output, new int[] {1, 2, 3, 4}));
    }

    public boolean contains(List<List<Integer>> arr1, int[] arr2) {
        for (List<Integer> subArr : arr1) {
            Collections.sort(subArr);
            if (compare(subArr, arr2)) {
                return true;
            }
        }
        return false;
    }

    public boolean compare(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
