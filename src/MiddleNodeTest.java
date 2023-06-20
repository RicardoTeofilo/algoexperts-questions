import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MiddleNodeTest {

    @Test
    public void TestCase1() {
        MiddleNode.LinkedList linkedList = new MiddleNode.LinkedList(0);
        linkedList.next = new MiddleNode.LinkedList(1);
        MiddleNode.LinkedList expected = new MiddleNode.LinkedList(2);
        linkedList.next.next = expected;
        expected.next = new MiddleNode.LinkedList(3);
        var actual = new MiddleNode().middleNode(linkedList);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestCase2() {

        MiddleNode.LinkedList linkedList = new MiddleNode.LinkedList(5);
        MiddleNode.LinkedList expected = new MiddleNode.LinkedList(7);
        linkedList.next = expected;
        expected.next = new MiddleNode.LinkedList(9);
        var actual = new MiddleNode().middleNode(linkedList);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestCase3() {

        MiddleNode.LinkedList linkedList = new MiddleNode.LinkedList(1);
        linkedList.next = new MiddleNode.LinkedList(2);
        linkedList.next.next = new MiddleNode.LinkedList(3);
        linkedList.next.next.next = new MiddleNode.LinkedList(4);
        MiddleNode.LinkedList expected = new MiddleNode.LinkedList(5);
        linkedList.next.next.next.next = expected;
        expected.next = new MiddleNode.LinkedList(6);
        expected.next.next = new MiddleNode.LinkedList(7);
        expected.next.next.next = new MiddleNode.LinkedList(8);
        expected.next.next.next.next = new MiddleNode.LinkedList(9);
        var actual = new MiddleNode().middleNode(linkedList);
        assertTrue(expected.equals(actual));
    }
}
