package beans;
/*
 * The class demonstrates a node in a data structure
 */
class Node {
    //Fields
    int data;
    Node nextNode;

    /*
     * The default constructor
     */
    public Node() {
        this.data = 0;
        this.nextNode = null;
    }

    /*
     * The overloaded constructor
     * @param data The data of a node to set
     */
    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }
}

/*
 * The class demonstrates a common data structure Singly Linked List
 */
public class SinglyLinkedList {
    //Field
    private Node headNode;

    /*
     * The default constructor
     */
    public SinglyLinkedList() {
        this.headNode = null;
    }

    /*
     * The method returns the reference of the head node
     */
    public Node getHeadNode() {
        return this.headNode;
    }

    /*
     * The method sets the reference of the head node
     */
    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    /*
     * The method implements the insertion operation of 
     * a new node to the linked list
     */
    public void insert(int data) {
        Node currentNode = this.headNode;
        if(this.headNode == null) {
            headNode = new Node(data);
        }
        else {
            while(currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node(data);
        }
    }

    /*
     * The method prints all elements of the linked list
     */
    public void printAll() {
        Node currentNode = this.headNode;

        if(this.headNode == null)
            System.out.println("The list is empty!");
        else {
            while(currentNode!= null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.nextNode;
            }
            System.out.println();
        }

    }
}
