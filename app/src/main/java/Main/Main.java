package test;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist(13);
        list.insert(36);
        list.insert(39);
        list.insert(52);
        list.insert(65);

        list.printList();
        System.out.println("==========================");
        list.removeAtStart(); //remove 13
        list.printList();
        System.out.println("==========================");
        list.addAtStart(1); // add 1
        list.printList();
    }
}
