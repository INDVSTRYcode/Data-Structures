/**
 * @author Jaankee
 * @version 1.2
 * Creates LinkedList Class
 */public class LinkedList<T>{

    private static class Node<T>{

        //creates static inner class for node

        //creates string placeholder for node data
        private T data;
    
        //creates next node in the linked list
        private Node<T> next;
    
        private void setData(T data){
    
            //creates setter for node's data
    
            this.data = data;
    
        }
    
        private void setNext(Node<T> head){
            //creates setter for next node
    
            next = head;
    
        }
    
        private T getData(){
            //creates getter for node's data
    
            return data;
    
        }
    
        private Node<T> getNext(){
            //creates getter for next node in list
    
            return next;
            
        }
    
        //constructor for node
        private Node(T d){
            
            this.data = d;
    
        }
    
    }

    //creates base node
   private Node<T> head;

   //instance variable for counting length of list
   private int size = 1;

   private T tempT;

   public void add(T data){
    
    //method for adding next node in list

    if (data == null) {

        //if node's data passed in is null, kill program

        throw new IllegalArgumentException("illegal arguememt: null");

    } else {

        //data is not null

        Node<T> nodeToAdd = new Node<T>(data);
        
        nodeToAdd.setNext(this.head);

        this.head = nodeToAdd;

        size++;

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

    public int getLength(){

        //return length of list

        return size;

    }

    public static void main(String[] args){

        //demo to test

        }  
     
}




    

