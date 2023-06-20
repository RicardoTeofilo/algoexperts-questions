import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EvaluateExpressionTreeTest {

    @Test
    public void TestCase1() {
        EvaluateExpressionTree.BinaryTree tree = new EvaluateExpressionTree.BinaryTree(-1);
        tree.left = new EvaluateExpressionTree.BinaryTree(2);
        tree.right = new EvaluateExpressionTree.BinaryTree(-2);
        tree.right.left = new EvaluateExpressionTree.BinaryTree(5);
        tree.right.right = new EvaluateExpressionTree.BinaryTree(1);
        var expected = 6;
        var actual = new EvaluateExpressionTree().evaluateExpressionTree(tree);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase2() {
        EvaluateExpressionTree.BinaryTree tree = new EvaluateExpressionTree.BinaryTree(-2);
        tree.left = new EvaluateExpressionTree.BinaryTree(2);
        tree.right = new EvaluateExpressionTree.BinaryTree(3);
        var expected = -1;
        var actual = new EvaluateExpressionTree().evaluateExpressionTree(tree);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase3() {
        EvaluateExpressionTree.BinaryTree tree = new EvaluateExpressionTree.BinaryTree(-3);
        tree.left = new EvaluateExpressionTree.BinaryTree(2);
        tree.right = new EvaluateExpressionTree.BinaryTree(3);
        var expected = 0;
        var actual = new EvaluateExpressionTree().evaluateExpressionTree(tree);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase4() {
        EvaluateExpressionTree.BinaryTree tree = new EvaluateExpressionTree.BinaryTree(-1);
        tree.left = new EvaluateExpressionTree.BinaryTree(2);
        tree.right = new EvaluateExpressionTree.BinaryTree(-2);
        tree.right.left = new EvaluateExpressionTree.BinaryTree(4);
        tree.right.right = new EvaluateExpressionTree.BinaryTree(5);
        var expected = 1;
        var actual = new EvaluateExpressionTree().evaluateExpressionTree(tree);
        assertTrue(expected == actual);
    }
}
