/**
 * @author Jaankee
 * @version 1.2
 * Creates Queue Class
 */
import java.lang.Math;
public class Queue<T>{

    private static class Node<T>{

        //creates static inner class for node

        //creates string placeholder for node data
        private T data;
    
        //creates next node in the linked list
        private Node<T> next;
    
        private void setNext(Node<T> head){
            //creates setter for next node
    
            next = head;
    
        }
    
        private T getData(){
            //creates getter for node's data
    
            return data;
    
        }

        private void setData(T data) {

            this.data = data;

        }
    
        private Node<T> getNext(){
            //creates getter for next node in list
    
            return next;
            
        }
    
        //constructor for node
        private Node(T d){
            
            this.setData(d);
    
        }
    
    }

    private Node<T> head;

   //instance variable for counting length of list
   private int size = 1;

   int random;

   private T tempT;

   public void enQueue(T data){
    
    //method for adding next node in list

    if (data == null) {

        //if node's data passed in is null, throw exception

        throw new IllegalArgumentException("illegal arguememt: null");

    } else {

        //data is not null

        Node<T> nodeToAdd = new Node<T>(data);
        
        nodeToAdd.setNext(this.head);

        this.head = nodeToAdd;

        size++;

        }

    }

    public void fillQueue(int x, Queue<Integer> queue){

        for(int y = 0; y < x; y++){

            random = (int)(Math.random() * x);

            queue.enQueue(random);

        }

    }

    public T deQueue(){

        if (this.head == null){

            //if list is empty, throw exception

            throw new NullPointerException("cannot remove null");

        } else if (this.head.getNext() == null) {

            return this.remove();

        } else {

            Node<T> lastNode = head;

            Node<T> currentNode = head.getNext();
            
            // Run until last element
            while(currentNode.getNext() != null) {

                lastNode = currentNode;

                currentNode = currentNode.getNext();
            }
            
            // Get the data from the last element
            T data = currentNode.getData();
            
            // Set the second-last element's pointer to null
            lastNode.setNext(null);
            
            // Decrement size
            size--;
            
            // Return the data
            return data;

        }

    }

    public T remove(){ 

        //method for removing nodes from list

         if (this.head == null){

            //if list is empty, throw exception

            throw new NullPointerException("cannot remove null");

        } else {

            //if there is another node in line, replace current node

            tempT = this.head.getData();

            this.head = this.head.getNext();

            size--;

            return tempT;
    
        }

    }

    public T peek(){

        return this.head.getData();

    }

    public int getSize(){

        //return length of list

        return size;

    }

    public String toString(){

        String output = "[ ";
 
        if (head != null) {

            Node<T> current = head;

            while (current != null) {

                output += current.getData().toString() + " ";

                current = current.getNext();
            }
 
        }

        return output += "]\n";

    }

    public int locatePosition(int x){
        // Start at the head
        Node<T> currentNode = head;
        int y = 0;
            
        // Traverse the list until either the end or the data is found
        while(y != x) {
            
            currentNode = currentNode.getNext();
            y++;

        }

        return (int)currentNode.getData();

    }

    public static void main(String[] args){

        Queue<Integer> newQueue = new Queue<Integer>();

        newQueue.enQueue(0);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        System.out.println(newQueue.toString());
        System.out.println(newQueue.locatePosition(1));

    }
    
}
