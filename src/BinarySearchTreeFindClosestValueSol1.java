public class BinarySearchTreeFindClosestValueSol1 {
    public static int findClosestValueInBst(BST tree, int target) {

        BST current = tree;
        int closestNodeValueDistance = Math.abs(target - tree.value);
        int closestValue = tree.value;

        while (true) {

            if (target == current.value) {
                return target;

            } else if (target < current.value) {
                int thisDistance = Math.abs(target - current.value);
                if (thisDistance < closestNodeValueDistance) {
                    closestNodeValueDistance = thisDistance;
                    closestValue = current.value;
                }

                if (current.left == null) {
                    return closestValue;
                } else {
                    current = current.left;
                }

            } else { //target > current.value

                int thisDistance = Math.abs(target - current.value);
                if (thisDistance < closestNodeValueDistance) {
                    closestNodeValueDistance = thisDistance;
                    closestValue = current.value;
                }

                if (current.right == null) {
                    return closestValue;
                } else {
                    current = current.right;
                }
            }

        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}


