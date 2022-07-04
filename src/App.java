import java.util.Random;
import beans.SinglyLinkedList;
import beans.Rectangle;

/*
 * The program demonstrates essensial operations of 
 * the linked list data structure
 */
public class App {
    //Class Properties
    private static SinglyLinkedList<Integer> integerList = new SinglyLinkedList<>();
    private static SinglyLinkedList<String> stringList = new SinglyLinkedList<>();
    private static SinglyLinkedList<Rectangle> rectangleList = new SinglyLinkedList<>();
    
    //The System-generated method
    public static void main(String[] args) {
        //Create a new linked list object
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        integerList.add(400);
        
        printList(integerList);

        stringList.add("HELLO");
        stringList.add("JAVA");
        stringList.add("WORLD");
        stringList.remove("JAVA");
        printList(stringList);


        System.exit(0);


    }

    /*
     * The method prints the current length of 
     * the linked list to the console
     * @param list The linked list reference
     */
    public static <T> void printLength(SinglyLinkedList<T> list) {
        System.out.println("The length of the list is " + list.length());
    }

    /*
     * The method prints the entire contents of the linked list.
     */
    public static <T> void printList(SinglyLinkedList<T> list) {       
		System.out.println();
		System.out.println("*****PRINTING THE LINKED LIST*****");
		System.out.println("********* LIST'S SIZE: " + list.length() + " *********");
		
		System.out.print(list);
		System.out.println("**********************************\n");	
    }


}
