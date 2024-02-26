package datastructure;

public class App {

    public static void main(String[] args) {
        DoubleLinkedList linkedList = new DoubleLinkedList(1);

        linkedList.append(2);

        linkedList.prepend(3);
        linkedList.printList();
        System.out.println("##################");
        // linkedList.removeFirst();
        // linkedList.printList();
        System.out.println(linkedList.get(2).value);
        System.out.println("##################");
        linkedList.insert(2, 9);
        linkedList.remove(1);
        linkedList.printList();
    }
}
