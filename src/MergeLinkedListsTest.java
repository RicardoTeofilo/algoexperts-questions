import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLinkedListsTest {

    public MergeLinkedLists.LinkedList addMany(MergeLinkedLists.LinkedList ll, List<Integer> values) {
        MergeLinkedLists.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new MergeLinkedLists.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(MergeLinkedLists.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        MergeLinkedLists.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(2);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(6, 7, 8)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase1Improved() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(2);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(6, 7, 8)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsImproved(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase1Recursive() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(2);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(6, 7, 8)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsRecursive(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase2() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(6);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(7, 8, 9, 10)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase2Improved() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(6);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(7, 8, 9, 10)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsImproved(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase2Recursive() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(6);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(7, 8, 9, 10)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsRecursive(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase3() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(3, 5, 7, 9)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(2);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(4, 6, 8, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase3Improved() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(3, 5, 7, 9)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(2);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(4, 6, 8, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsImproved(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase3Recursive() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(3, 5, 7, 9)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(2);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(4, 6, 8, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsRecursive(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
    @Test
    public void TestCase4() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 7, 8, 9, 10)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(6);
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase4Improved() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 7, 8, 9, 10)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(6);
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsImproved(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase4Recursive() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 7, 8, 9, 10)));
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(6);
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsRecursive(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase5() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(6);
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 7, 8, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase5Improved() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(6);
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 7, 8, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsImproved(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase5Recursive() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(6);
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 7, 8, 9, 10)));
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsRecursive(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
    @Test
    public void TestCase6() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(2);
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase6Improved() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(2);
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsImproved(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase6Recursive() {
        MergeLinkedLists.LinkedList list1 = new MergeLinkedLists.LinkedList(1);
        MergeLinkedLists.LinkedList list2 = new MergeLinkedLists.LinkedList(2);
        MergeLinkedLists.LinkedList output = MergeLinkedLists.mergeLinkedListsRecursive(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2));
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
}
