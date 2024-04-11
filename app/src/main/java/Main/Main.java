package Main;

public class Main {
    static void multiplyByN(int number) {
        int n = number * 2;

        if (n < 10) {
            multiplyByN(n);
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        // BinarySearchTree tree = new BinarySearchTree(8);
        // tree.insert(10);

        // // System.out.println(tree.root.value);
        // // System.out.println(tree.root.right.value);
        // tree.delete(10);

        // tree.find(10);

        multiplyByN(2);
        int n = 2 * 2;
        while (n < 10) {
            n = n * 2;
        }
        System.out.println(n);

    }
}
