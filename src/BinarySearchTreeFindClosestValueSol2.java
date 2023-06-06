public class BinarySearchTreeFindClosestValueSol2 {

    public static int findClosestValueInBst(BST tree, int target) {
        int currentNodeDistance = Math.abs(target - tree.value);
        return findClosestValueInBst(tree, target, tree.value, currentNodeDistance);
    }

    public static int findClosestValueInBst(BST tree, int target, int smallestNodeValue, int smallestNodeDistance) {

        BST current = tree;
        int currentNodeDistance = Math.abs(target - tree.value);
        if(currentNodeDistance < smallestNodeDistance) {
            smallestNodeDistance = currentNodeDistance;
            smallestNodeValue = current.value;
        }

        if(target == current.value)
            return target;
        else if(target < current.value){
            if (current.left == null){
                return smallestNodeValue;
            }else {
                return findClosestValueInBst(current.left, target, smallestNodeValue, smallestNodeDistance);
            }
        }else{
            if(current.right == null){
                return smallestNodeValue;
            }else {
                return findClosestValueInBst(current.right, target, smallestNodeValue, smallestNodeDistance);
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
