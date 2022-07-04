package beans;
/*
 * The class demonstrates a generic node.
 */
class Node<T>{
    //Fields
    T data;
    Node<T> nextNode;

    /*
     * The default constructor
     */
    public Node() {
        this.data = null;
        this.nextNode = null;
    }

    /*
     * The overloaded constructor
     * @param data The data of a node to set
     */
    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }
}
/*
 * The class demonstrates a generic Singly Linked List
 */
public class SinglyLinkedList<T> {
    //Field
    private Node<T> headNode;

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
    public Node<T> getHeadNode() {
        return this.headNode;
    }

    /*
     * The method inserts the specified element to the end of the list.
     * @param data The element to be inserted
     * @return true if the insert is done successfully
     */
    public void add(T data) {
        Node<T> currentNode = this.headNode;
        if(this.headNode == null) {
            headNode = new Node<>(data);
        }
        else {
            while(currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node<>(data);
        }
    }

    /*
     * The method inserts the specified element to the end of the list.
     * @param data The element to be inserted
     * @return true if the insert is done successfully
     */
    public void addLast(T data) {
        this.add(data);
    }

    /*
     * The method inserts the specified element
     * at the specified position in the list.
     * @param index The position to the element to be inserted
     * @param data The element to be inserted
     */
    public void add(int index, T data) {
        if(index < 0 || index >= this.length())
            throw new ArrayIndexOutOfBoundsException("Error: Index is out of range");
            
        else if (index == 0) {
            this.addFirst(data);
        }
        else {
            int counter = 0;
            Node<T> currentNode = this.headNode;
            while(counter != index - 1) {
                currentNode = currentNode.nextNode;
                counter++;
            }
            Node<T> newNode = new Node<>(data);
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
        }
           
    }

    /*
     * The method insert the specified element at
     * the beginning of the list.
     * @param data The element to be inserted
     */
    public void addFirst(T data) {
        Node<T> tempNode = new Node<>(data);
        tempNode.nextNode = this.headNode;
        this.headNode = tempNode;
    } 

    /*
     * The method removes the first
     * element from the linked list
     * @return true if the list is not empty
     */
    public boolean removeFirst() {
        boolean status = false;
        if(this.headNode == null) {
            throw new NullPointerException("Error: cannot remove an " +
                                            "element from the empty list!");
        }
        else {    
            Node<T> currentNode = this.headNode;    
            this.headNode = currentNode.nextNode;
            currentNode.nextNode = null;
        }
        return status;
    }

    /*
     * The method removes the last
     * element from the linked list
     * @return true if the list is not empty
     */
    public boolean removeLast() {
        boolean status = false;
        Node<T> currentNode = this.headNode;
        if(currentNode == null)
            throw new NullPointerException("Error: cannot remove an " +
                                            "element from the empty list!");
        else if(currentNode.nextNode == null) {
            this.removeFirst();
            status = true;
        }
        else {
            while(currentNode.nextNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = null;
            status = true;
        }
        return status;
    }

    /*
     * The method removes the element at
     * the specified position in the list
     * @param index The position of the element to be deleted
     * @return true if the list is not empty and the index is valid
     */
    public boolean remove(int index) {
        boolean status = false;

        if(this.headNode == null) 
            throw new NullPointerException("Error: cannot remove an " +
                                            "element from the empty list!");
        
        else if (index < 0 || index >= this.length()) 
            throw new ArrayIndexOutOfBoundsException("Error: Index is out of range");
        
        else if (index == 0) {
            removeFirst();
            status = true;
        }

        else if(index == this.length() - 1) {
            removeLast();
            status = true;
        }
        
        else {
            Node<T> previousNode = this.headNode;
            Node<T> currentNode = previousNode.nextNode;
            int counter = 0;
            while(counter != (index - 1)) {
                previousNode = previousNode.nextNode;
                currentNode = currentNode.nextNode;
                counter++;
            }
            previousNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = null;
            status = true;
        }
        return status;

    }
    
    /*
     * The method removes the first occurrence of the 
     * specified element from the linked list, if it is present
     * @param data The first occurrence specified element to be deleted
     * @return true if the element exists in the linked list
     */
    public boolean remove(T data) {
        boolean status = false;
        
        if(this.headNode == null) 
            throw new NullPointerException("Error: cannot remove an " +
                                            "element from the empty list!");

        //If the specified data is located at the beginning of the list                                    
        else if(this.headNode.data == data) {
            removeFirst();
            status = true;
        }

        else {
            Node<T> previousNode = this.headNode;
            Node<T> currentNode = previousNode.nextNode;

            while(currentNode != null) {
                if(currentNode.data == data) {
                    previousNode.nextNode = currentNode.nextNode;
                    currentNode.nextNode = null;
                    status = true;
                    break;
                }
                previousNode = previousNode.nextNode;
                currentNode = currentNode.nextNode;
            }
        }
            return status;
    }

    /*
     * The method removes all of the elements from the linked list
     */
    public void clear() {
        this.headNode = null;
    }

    /*
     * The method returns the current length of the linked list
     * @return the current length of the linked list
     */
    public int length() {
        int length = 0;
        Node<T> currentNode = this.headNode;
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
        Node<T> currentNode = this.headNode;

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
