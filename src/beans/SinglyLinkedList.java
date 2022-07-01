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
 * The class demonstrates a common data structure  Singly Linked List
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
     * @return the head node reference
     */
    public Node getHeadNode() {
        return this.headNode;
    }

    /*
     * The method sets the reference of the head node
     * @param headNode The head node reference to set
     */
    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    /*
     * The method inserts the specified element to the end of the list.
     * @param data The element to be inserted
     * @return true if the insert is done successfully
     */
    public void add(int data) {
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
     * The method inserts the specified element to the end of the list.
     * @param data The element to be inserted
     * @return true if the insert is done successfully
     */
    public void addLast(int data) {
        this.add(data);
    }

    /*
     * The method inserts the specified element
     * at the specified position in the list.
     * @param index The position to the element to be inserted
     * @param data The element to be inserted
     */
    public void add(int index, int data) {
        if(index < 0 || index >= this.length())
            throw new ArrayIndexOutOfBoundsException("Error: Index is out of range");
            
        else if (index == 0) {
            this.addFirst(data);
        }
        else {
            int counter = 0;
            Node currentNode = this.headNode;
            while(counter != index - 1) {
                currentNode = currentNode.nextNode;
                counter++;
            }
            Node newNode = new Node(data);
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
        }
           
    }

    /*
     * The method insert the specified element at
     * the beginning of the list.
     * @param data The element to be inserted
     */
    public void addFirst(int data) {
        Node tempNode = new Node(data);
        tempNode.nextNode = this.headNode;
        this.headNode = tempNode;
    } 

    /*
     * The method returns the current length of the linked list
     * @return the current length of the linked list
     */
    public int length() {
        int length = 0;
        Node currentNode = this.headNode;
        //If the headNode is null, the linked list is empty
        if(this.headNode == null) 
            return 0;     
        
        while (currentNode != null) {
            length++;
            currentNode = currentNode.nextNode;
        }       
        return length;
    }

    /*
     * The method converts the entire
     * elements of the linked list as a string
     * @return the string of linked list's elements
     */
    public String toString() {
        StringBuilder string = new StringBuilder();
        Node currentNode = this.headNode;

        if(this.headNode == null)
            string.append ("The list is empty!");
        else {
            while(currentNode!= null) {
                string.append(currentNode.data + " ");
                currentNode = currentNode.nextNode;
            }
        }
        string.append("\n"); 
        return string.toString();
    }
}
