/**
 * @author Jankee
 * @version 1.0
 * 
 * creates sorted binary search tree from scratch
 *
 */
public class BinarySearchTree{

    private int data;

    private Node root; //first node in tree
    
    private static class Node{

        //creates static inner class for node

        //creates string placeholder for node data
        private int data;
    
        //creates left branch node
        private Node leftNode;

        //creates the right branch node
        private Node rightNode;
    
        private void setNext(String direction, Node next){
            //creates setter for next node
    
            if(direction.equalsIgnoreCase("left")){

                leftNode = next;

            } else if (direction.equalsIgnoreCase("right")){

                rightNode = next;

            }
    
        }
    
        private int getData(){
            //creates getter for node's data
    
            return data;
    
        }

        private void setData(int data) {

            this.data = data;

        }
    
        private Node getLeftNode(){
            //creates getter for left node
    
            return leftNode;
            
        }

        private Node getRightNode(){
            //creates getter for right node
    
            return rightNode;
            
        }
    
        //constructor for node
        private Node(int d){
            
            this.setData(d);

            leftNode = rightNode = null;
    
        }
    
    }

    public Node insertElement(int data, Node current){

        Node nodeToAdd = new Node(data);

        if (current == null){

            //no node is found, add node with new value
            
            return nodeToAdd;
            
        } else if (data < current.getData()) {

            //value is less than current value, so recurse down the left side of the tree

            current.setNext("left", insertElement(data, current.getLeftNode()));

        } else if (data > current.getData()) {

            //value is greater than current value, so recurse down the right side of the tree

            current.setNext("right", insertElement(data, current.getRightNode()));

        } else {

            //value already exists
            
            return current;

        } return current;

    }

    public void add(int data) {
        
        //commence recursive sorting addition at the root

        root = insertElement(data, root);

    }

    public boolean containsNodeRecursion(Node current, int data){
        
        //looks for node

        if(current == null) return false; //if there is no node return false

        if (data == current.getData()) return true; //if node is found return true
        
        //if node data is smaller than target data, go down the right tree. if node data is larger, go down left tree.

        return data > current.getData() ? containsNodeRecursion(current.getRightNode(), data) : containsNodeRecursion(current.getLeftNode(), data);

    }

    public int findSmallestValue(Node root) {
        
        //recursive search down left path for smallest node

        return root.getLeftNode() == null ? root.getData() : findSmallestValue(root.getLeftNode());

    }

    public Node deleteNodeRecursion(Node current, int data){

        if(current == null) return null; //if no node exists, nice

        if (data == current.getData()){

            if(current.getLeftNode() == null && current.getRightNode() == null){
                
                //if desired node is found and has no children, nice

                return null;

            } else if (current.getLeftNode() == null) {
                
                //if node is found and only has right child, replace with right child
                
                return current.getRightNode();

            } else if (current.getRightNode() == null) {
                
                //if node is found and only has left child, replace with left child

                return current.getLeftNode();
                
            }

            int smallestValue = findSmallestValue(current.getRightNode()); //finds smallest node

            current.setData(smallestValue);  //don't fully know what's going on here

            current.setNext("right", deleteNodeRecursion(current.getRightNode(), smallestValue));
            
            return current;

        }

        if (data < current.getData()){

            current.setNext("left", deleteNodeRecursion(current.getLeftNode(), data));

            return current; // or here

        }

        current.setNext("right", deleteNodeRecursion(current.getRightNode(), data));

        return current; //or here

    }

    public void delete(int data){

        root = deleteNodeRecursion(root, data);

    }

    public boolean containsNode(int data){

        return containsNodeRecursion(root, data);

    }
    public static void main(String args[]){



    }
}
