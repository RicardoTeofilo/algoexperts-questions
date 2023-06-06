import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedListTest {

    @Test
    public void TestCase1() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {5, 4, 3, 2, 1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase2() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase3() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {2, 1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase4() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0, 1});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase5() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedList(test));
        int[] expected = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase6() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedListRecursive(test));
        int[] expected = new int[] {5, 4, 3, 2, 1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase7() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedListRecursive(test));
        int[] expected = new int[] {0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase8() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedListRecursive(test));
        int[] expected = new int[] {2, 1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase9() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0, 1});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedListRecursive(test));
        int[] expected = new int[] {1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    @Test
    public void TestCase10() {
        ReverseLinkedList.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        List<Integer> result = toArrayList(ReverseLinkedList.reverseLinkedListRecursive(test));
        int[] expected = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    public ReverseLinkedList.LinkedList newLinkedList(int[] values) {
        ReverseLinkedList.LinkedList ll = new ReverseLinkedList.LinkedList(values[0]);
        ReverseLinkedList.LinkedList current = ll;
        for (int i = 1; i < values.length; i++) {
            current.next = new ReverseLinkedList.LinkedList(values[i]);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> toArrayList(ReverseLinkedList.LinkedList ll) {
        List<Integer> arr = new ArrayList<Integer>();
        ReverseLinkedList.LinkedList current = ll;
        while (current != null) {
            arr.add(current.value);
            current = current.next;
        }
        return arr;
    }

    public boolean arraysEqual(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) return false;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) return false;
        }
        return true;
    }
}
