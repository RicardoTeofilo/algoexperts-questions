/**
 *
 */
public class EvaluateExpressionTree {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int evaluateExpressionTree(BinaryTree tree) {

        if(tree.value >= 0)
            return tree.value;

        int leftTreeValue = evaluateExpressionTree(tree.left);
        int rightTreeValue = evaluateExpressionTree(tree.right);

        if(tree.value == -1)
            return leftTreeValue + rightTreeValue;
        else if (tree.value == -2)
            return leftTreeValue - rightTreeValue;
        else if (tree.value == -3)
            return leftTreeValue / rightTreeValue;
        else
            return leftTreeValue * rightTreeValue;

    }
}
