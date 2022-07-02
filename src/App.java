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

        populateList(l1);
        printList(l1);
        printLength(l1);

        l1.clear();

        printList(l1);
        printLength(l1);



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
    public static void populateList(SinglyLinkedList list) {
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
