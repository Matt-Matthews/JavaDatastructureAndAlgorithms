package datastructure;

public class App {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(3);
        linkedList.append(5);
        linkedList.append(9);
        linkedList.insert(2, 0);

        linkedList.reverse();

        linkedList.printList();
        System.out.println();
    }
}
