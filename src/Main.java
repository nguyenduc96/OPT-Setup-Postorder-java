public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(9);
        tree.insert(3);
        tree.insert(4);
        tree.insert(8);
        tree.insert(16);
        tree.insert(7);
        tree.insert(11);
        tree.insert(12);
        tree.insert(19);
        System.out.println(search(tree.root, 7));
        System.out.println();
        tree.postorder(search(tree.root, 19));
    }

    public static TreeNode<Integer> search(TreeNode<Integer> root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (root.key > key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }
}
