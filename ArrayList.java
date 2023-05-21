/**
 * @author Jankee 
 * @version 1
 * Creates Arraylist data structure
 */
public class ArrayList <T>{

    private Object[] arr;
    private int size;

    public ArrayList(){

        //initialize array with default size

        arr = new Object[12];
        size = 0;

    }

    public ArrayList(int size){

        //initialize array with custom size

        arr = new Object[size];
        this.size = 0;

    }

    @SuppressWarnings("unchecked")
    public T get(int index){

        //if index is invalid, throw ex

        if(index >= size || index < 0){
            
            throw new IndexOutOfBoundsException(index);

        }

        return (T) arr[index]; //return data

    }

    public int getSize(){

        return size;

    }

    public String toString(){

        String str = "";

        for(int x = 0; x < size - 1; x++){

            //add array data to string

            str += (arr[x] + " ");
            
        }

        return str;

    }

    public void add(T data){

        if(size >= arr.length){

            increaseSize();
        
        }

        arr[size] = data;

        size++;

    }

    @SuppressWarnings("unchecked")
    public T remove(int index){

        T temp;

        temp = (T) arr[index];

        for(int x = index; x < size - 2; x++){

            //slide all indexs right of target, to the left

            arr[x] = arr[x + 1];

        }

        size--;
        
        return temp; //return removed data

    }

    public void increaseSize(){

        Object[] newArr;

        newArr = new Object[arr.length * 2]; //new array with twice the length

        for(int x = 0; x < arr.length - 1; x++){

            //clone array

            newArr[x] = arr[x];

            //replace array

            arr = newArr;

        } 

    }

    public static void main(String[] args){

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int x = 0; x < 100; x++) {
            
            arrList.add(x);

        }

        System.out.println(arrList.toString());

        System.out.println(arrList.remove(20));

    }
}
