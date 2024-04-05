package datastructure;

public class BinarySearchTree {

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        root = newNode;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;

        while (true) {
            if (newNode.value == temp.value)
                return false;

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {

        Node temp = root;

        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else
                return true;
        }

        return false;
    }

    private void inOrderSort(Node currentNode) {
        if (currentNode != null) {
            inOrderSort(currentNode.left);
            System.out.println(currentNode.value);
            inOrderSort(currentNode.right);
        }
    }

    public void inOrderTraversal() {
        inOrderSort(root);
    }

}
