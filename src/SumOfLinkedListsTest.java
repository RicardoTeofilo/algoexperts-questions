import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SumOfLinkedListsTest {

    @Test
    public void TestCase1() {
        SumOfLinkedLists.LinkedList ll1 = addMany(new SumOfLinkedLists.LinkedList(2), new int[] {4, 7, 1});
        SumOfLinkedLists.LinkedList ll2 = addMany(new SumOfLinkedLists.LinkedList(9), new int[] {4, 5});
        SumOfLinkedLists.LinkedList expected = addMany(new SumOfLinkedLists.LinkedList(1), new int[] {9, 2, 2});
        var actual = new SumOfLinkedLists().sumOfLinkedLists(ll1, ll2);
        Assert.assertTrue(getNodesInArray(expected).equals(getNodesInArray(actual)));
    }

    @Test
    public void TestCase2() {
        SumOfLinkedLists.LinkedList ll1 = new SumOfLinkedLists.LinkedList(2);
        SumOfLinkedLists.LinkedList ll2 = new SumOfLinkedLists.LinkedList(9);
        SumOfLinkedLists.LinkedList expected = addMany(new SumOfLinkedLists.LinkedList(1), new int[] {1});
        var actual = new SumOfLinkedLists().sumOfLinkedLists(ll1, ll2);
        Assert.assertTrue(getNodesInArray(expected).equals(getNodesInArray(actual)));
    }

    @Test
    public void TestCase3() {
        SumOfLinkedLists.LinkedList ll1 = addMany(new SumOfLinkedLists.LinkedList(0), new int[] {0, 0, 5});
        SumOfLinkedLists.LinkedList ll2 = new SumOfLinkedLists.LinkedList(9);
        SumOfLinkedLists.LinkedList expected = addMany(new SumOfLinkedLists.LinkedList(9), new int[] {0, 0, 5});
        var actual = new SumOfLinkedLists().sumOfLinkedLists(ll1, ll2);
        Assert.assertTrue(getNodesInArray(expected).equals(getNodesInArray(actual)));
    }

    @Test
    public void TestCase4() {
        SumOfLinkedLists.LinkedList ll1 = addMany(new SumOfLinkedLists.LinkedList(1), new int[] {2, 3});
        SumOfLinkedLists.LinkedList ll2 = addMany(new SumOfLinkedLists.LinkedList(6), new int[] {7,9, 1, 8});
        SumOfLinkedLists.LinkedList expected = addMany(new SumOfLinkedLists.LinkedList(7), new int[] {9, 2, 2, 8});
        var actual = new SumOfLinkedLists().sumOfLinkedLists(ll1, ll2);
        Assert.assertTrue(getNodesInArray(expected).equals(getNodesInArray(actual)));
    }

    public SumOfLinkedLists.LinkedList addMany(SumOfLinkedLists.LinkedList linkedList, int[] values) {
        var current = linkedList;
        while (current.next != null) {
            current = current.next;
        }
        for (var value : values) {
            current.next = new SumOfLinkedLists.LinkedList(value);
            current = current.next;
        }
        return linkedList;
    }

    public ArrayList<Integer> getNodesInArray(SumOfLinkedLists.LinkedList linkedList) {
        ArrayList<Integer> nodeValues = new ArrayList<Integer>();
        SumOfLinkedLists.LinkedList current = linkedList;
        while (current != null) {
            nodeValues.add(current.value);
            current = current.next;
        }
        return nodeValues;
    }
}
