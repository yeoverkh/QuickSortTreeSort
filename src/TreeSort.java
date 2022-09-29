public class TreeSort {

    private class Node {

        int value;
        Node leftChild, rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;
    private int index;

    private TreeSort() {
        root = null;
        index = 0;
    }

    public static void sort(int[] array) {
        TreeSort tree = new TreeSort();
        tree.insert(array);
        tree.inorderRec(tree.root, array);
    }

    private void insert(int[] array) {
        for (int item : array) {
            root = insertRec(root, item);
        }
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) root.leftChild = insertRec(root.leftChild, value);

        if (value >= root.value) root.rightChild = insertRec(root.rightChild, value);

        return root;
    }

    private void inorderRec(Node root, int[] array) {
        if (root != null) {
            inorderRec(root.leftChild, array);
            array[index++] = root.value;
            inorderRec(root.rightChild, array);
        }
    }
}
