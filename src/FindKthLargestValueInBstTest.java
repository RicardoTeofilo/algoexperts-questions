import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindKthLargestValueInBstTest {

    @Test
    public void TestCase1() {
        FindKthLargestValueInBst.BST root = new FindKthLargestValueInBst.BST(15);
        root.left = new FindKthLargestValueInBst.BST(5);
        root.left.left = new FindKthLargestValueInBst.BST(2);
        root.left.left.left = new FindKthLargestValueInBst.BST(1);
        root.left.left.right = new FindKthLargestValueInBst.BST(3);
        root.left.right = new FindKthLargestValueInBst.BST(5);
        root.right = new FindKthLargestValueInBst.BST(20);
        root.right.left = new FindKthLargestValueInBst.BST(17);
        root.right.right = new FindKthLargestValueInBst.BST(22);
        int k = 3;
        int expected = 17;
        var actual = new FindKthLargestValueInBst().findKthLargestValueInBst(root, k);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCaseReverse1() {
        FindKthLargestValueInBst.BST root = new FindKthLargestValueInBst.BST(15);
        root.left = new FindKthLargestValueInBst.BST(5);
        root.left.left = new FindKthLargestValueInBst.BST(2);
        root.left.left.left = new FindKthLargestValueInBst.BST(1);
        root.left.left.right = new FindKthLargestValueInBst.BST(3);
        root.left.right = new FindKthLargestValueInBst.BST(5);
        root.right = new FindKthLargestValueInBst.BST(20);
        root.right.left = new FindKthLargestValueInBst.BST(17);
        root.right.right = new FindKthLargestValueInBst.BST(22);
        int k = 3;
        int expected = 17;
        var actual = new FindKthLargestValueInBst().findKthLargestValueInBstReverseOrder(root, k);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase2() {
        FindKthLargestValueInBst.BST root = new FindKthLargestValueInBst.BST(5);
        root.left = new FindKthLargestValueInBst.BST(4);
        root.left.left = new FindKthLargestValueInBst.BST(3);
        root.right = new FindKthLargestValueInBst.BST(6);
        root.right.right = new FindKthLargestValueInBst.BST(7);
        int k = 1;
        int expected = 7;
        var actual = new FindKthLargestValueInBst().findKthLargestValueInBst(root, k);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCaseReverse2() {
        FindKthLargestValueInBst.BST root = new FindKthLargestValueInBst.BST(5);
        root.left = new FindKthLargestValueInBst.BST(4);
        root.left.left = new FindKthLargestValueInBst.BST(3);
        root.right = new FindKthLargestValueInBst.BST(6);
        root.right.right = new FindKthLargestValueInBst.BST(7);
        int k = 1;
        int expected = 7;
        var actual = new FindKthLargestValueInBst().findKthLargestValueInBstReverseOrder(root, k);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase3() {
        FindKthLargestValueInBst.BST root = new FindKthLargestValueInBst.BST(20);
        root.left = new FindKthLargestValueInBst.BST(15);
        root.left.left = new FindKthLargestValueInBst.BST(10);
        root.left.right = new FindKthLargestValueInBst.BST(19);
        root.right = new FindKthLargestValueInBst.BST(25);
        root.right.left = new FindKthLargestValueInBst.BST(21);
        root.right.right = new FindKthLargestValueInBst.BST(30);
        root.right.left.right = new FindKthLargestValueInBst.BST(22);
        int k = 3;
        int expected = 22;
        var actual = new FindKthLargestValueInBst().findKthLargestValueInBst(root, k);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCaseReverse3() {
        FindKthLargestValueInBst.BST root = new FindKthLargestValueInBst.BST(20);
        root.left = new FindKthLargestValueInBst.BST(15);
        root.left.left = new FindKthLargestValueInBst.BST(10);
        root.left.right = new FindKthLargestValueInBst.BST(19);
        root.right = new FindKthLargestValueInBst.BST(25);
        root.right.left = new FindKthLargestValueInBst.BST(21);
        root.right.right = new FindKthLargestValueInBst.BST(30);
        root.right.left.right = new FindKthLargestValueInBst.BST(22);
        int k = 3;
        int expected = 22;
        var actual = new FindKthLargestValueInBst().findKthLargestValueInBstReverseOrder(root, k);
        assertTrue(expected == actual);
    }
}
