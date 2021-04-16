public class BST_Generic {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(60);
        root.left = new TreeNode<>(55);
        root.right = new TreeNode<>(100);
    }
    static class TreeNode<E>{
        private E elements;
        private TreeNode<E> left;
        private TreeNode<E> right;

        public TreeNode(E e){
            elements = e;
        }
        public void printTree(){
            System.out.println();

        }


    }
}
