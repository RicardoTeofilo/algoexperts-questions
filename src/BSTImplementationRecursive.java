public class BSTImplementationRecursive {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            BST current = this;
            insertRecursive(value, current);
            return this;
        }

        public BST insertRecursive(int value, BST current){
            if(value < current.value){
                if (current.left == null){
                    current.left = new BST(value);
                }else {
                    return insertRecursive(value, current.left);
                }
            }else if (value >= current.value){
                if(current.right == null){
                    current.right = new BST(value);
                }else {
                    return insertRecursive(value, current.right);
                }
            }
            return current;
        }

        public boolean contains(int value) {
            // Write your code here.
            return contains(value, this);
        }

        public boolean contains(int value, BST current) {
            if (value == current.value)
                return true;
            else if(value < current.value){
                if (current.left == null)
                    return false;
                else
                    return contains(value, current.left);
            }else {
                if (current.right == null)
                    return false;
                else
                    return contains(value, current.right);
            }
        }

        public BST remove(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            return this;
        }
    }
}


