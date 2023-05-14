/**
 * @author Jaankee
 * @version 1.2
 * Creates Stack Class
 */
public class Stack<T>{ 

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

   private T tempT;

   public void push(T data){
    
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

    public T pop(){ 

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

    public static void main(String[] args){

        Stack<Integer> newStack = new Stack<Integer>();

        newStack.push(0);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println(newStack.toString());
        newStack.pop();
        System.out.println(newStack.toString());


    }
    
}
