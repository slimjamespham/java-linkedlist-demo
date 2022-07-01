import java.util.Random;
import beans.SinglyLinkedList;

/*
 * The program demonstrates essensial operations of 
 * the linked list data structure
 */
public class App {
    public static void main(String[] args) {
        //Create a new linked list object
        SinglyLinkedList l1 = new SinglyLinkedList();

        //Start poplulating the linked list
        l1.add(20);
        l1.add(30);
        printList(l1);
        
        l1.addFirst(10);
        printList(l1);

        l1.addLast(40);
        printList(l1);

        l1.add(1, 99);
        printList(l1);

        try {
            l1.add(7, 69);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System,out.println("The program will skip and continue...");
        }

        System.out.println("Length: " + l1.length());
        System.exit(0);

    }

    /*
     * The method prints the current length of 
     * the linked list to the console
     * @param list The linked list reference
     */
    public static void printLength(SinglyLinkedList list) {
        System.out.println("The length of the list is " + list.length());
    }

    /*
     * The methods populates the content of linked list with random data
     */
    public void populateList(SinglyLinkedList list) {
        Random random = new Random();
        int size = random.nextInt(10) + 1;
        System.out.println("Adding data to the linked list...\n");
        for(int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

    }

    public static void printList(SinglyLinkedList list) {
        System.out.println("Printing the Singly Linked List...");
        System.out.println(list);
    }


}
