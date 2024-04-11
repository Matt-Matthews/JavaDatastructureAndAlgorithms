package Main;

public class BinarySearchTree {
    class Node {
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
        // Create the root Node when creating a BinarySearchTree object
        root = newNode;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;

            while (true) {
                if (temp.value < newNode.value) {
                    // check if the value of temp Node is less than the value of the new Node
                    // if true we go to the right
                    if (temp.right == null) {
                        temp.right = newNode;
                        return; // breaks the loop
                    }
                    temp = temp.right; // if the right Node is not null we move further to the right
                } else {
                    // if value of temp is greater than or equals to value of newNode
                    if (temp.left == null) {
                        temp.left = newNode;
                        return;
                    }
                    temp = temp.left; // breaks the loop
                }
            }

        }

    }

    public void find(int value) {
        Node temp = root;

        while (temp != null) {
            if (temp.value > value) {
                temp = temp.left; // if root value is greater than the entered value we go to the left
            } else if (temp.value < value) {
                // if root value is less than the entered value we go to the right
                temp = temp.right;
            } else { // Equals
                System.out.println("Found: " + temp.value);
                return;
            }
        }
        System.out.println("Not Found");
    }

    public void delete(int value) { //
        Node temp = root;

        while (temp != null) {

            if (temp.value > value) {
                if (temp.left.value == value) {
                    temp.left = null;
                    return;
                }
                temp = temp.left; // if root value is greater than the entered value we go to the left
            } else if (temp.value < value) {
                // if root value is less than the entered value we go to the right
                if (temp.right.value == value) {
                    temp.right = null;
                    return;
                }
                temp = temp.right;
            } else { // Equals
                // if (temp.left == null && temp.right == null) {
                // temp = null;
                // } else if (temp.left != null) {
                // temp = temp.left;
                // } else if (temp.right != null) {
                // temp = temp.right;
                // }

                return;
            }
        }
        System.out.println("Not Found");
    }

}
