import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BSTImplementationRecursiveTest {

    @Test
    public void TestCase1() {
        var root = new BSTImplementationRecursive.BST(10);
        root.left = new BSTImplementationRecursive.BST(5);
        root.left.left = new BSTImplementationRecursive.BST(2);
        root.left.left.left = new BSTImplementationRecursive.BST(1);
        root.left.right = new BSTImplementationRecursive.BST(5);
        root.right = new BSTImplementationRecursive.BST(15);
        root.right.left = new BSTImplementationRecursive.BST(13);
        root.right.left.right = new BSTImplementationRecursive.BST(14);
        root.right.right = new BSTImplementationRecursive.BST(22);

        root.insert(12);
        assertTrue(root.right.left.left.value == 12);
        assertTrue(root.contains(12) == true);
        assertTrue(root.contains(22) == true);
//
//        root.remove(10);
//        assertTrue(root.contains(10) == false);
//      assertTrue(root.value == 12);

//      assertTrue(root.contains(15));
    }
}
