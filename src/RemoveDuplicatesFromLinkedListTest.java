import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromLinkedListTest {

    public RemoveDuplicatesFromLinkedList.LinkedList addMany(RemoveDuplicatesFromLinkedList.LinkedList ll, List<Integer> values) {
        RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new RemoveDuplicatesFromLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(RemoveDuplicatesFromLinkedList.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        RemoveDuplicatesFromLinkedList.LinkedList input = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        RemoveDuplicatesFromLinkedList.LinkedList output = new RemoveDuplicatesFromLinkedList().removeDuplicatesFromLinkedList(input);
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase2() {
        RemoveDuplicatesFromLinkedList.LinkedList input = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 9, 11, 15, 15, 16, 17)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 9, 11, 15, 16, 17));
        RemoveDuplicatesFromLinkedList.LinkedList output = new RemoveDuplicatesFromLinkedList().removeDuplicatesFromLinkedList(input);
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase3() {
        RemoveDuplicatesFromLinkedList.LinkedList input = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1));
        RemoveDuplicatesFromLinkedList.LinkedList output = new RemoveDuplicatesFromLinkedList().removeDuplicatesFromLinkedList(input);
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    @Test
    public void TestCase4() {
        RemoveDuplicatesFromLinkedList.LinkedList input = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(-5, -1, -1, -1, 5, 5, 5, 8, 8, 9, 10, 11, 11, 11)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, -5, -1, 5, 8, 9, 10, 11));
        RemoveDuplicatesFromLinkedList.LinkedList output = new RemoveDuplicatesFromLinkedList().removeDuplicatesFromLinkedList(input);
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
}
