package datastructure;

public class App {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(40);

        tree.insert(20);
        tree.insert(55);
        tree.insert(30);
        tree.insert(10);

        System.out.println("contains: " + tree.contains(0));
    }
}
