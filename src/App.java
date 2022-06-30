import beans.SinglyLinkedList;
/*
 * The program demonstrates using essensial operations of the linked list
 */
public class App {
    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();

        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.printAll();

        System.exit(0);

    }
}
