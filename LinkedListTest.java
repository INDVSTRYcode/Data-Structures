import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

    LinkedList<Integer> linkedList;

    public LinkedListTest(){

        linkedList = new LinkedList<Integer>();

    }

    @Test
    public void testAddToFront() {

        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);
        assertEquals((int)linkedList.remove(), 3);
        assertEquals((int)linkedList.removeLast(), 1);
        assertEquals((int)linkedList.remove(), 2);

    }

    @Test
    public void testGetSize() {

        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);
        assertEquals((int)linkedList.getSize(), 4);
        assertEquals((int)linkedList.remove(), 3);
        assertEquals((int)linkedList.removeLast(), 1);
        assertEquals((int)linkedList.remove(), 2);
    }

    @Test
    public void testInsertAfter() {

        linkedList.addToFront(3);
        linkedList.insertAfter(3, 2);
        linkedList.insertAfter(2, 1);
        assertEquals((int)linkedList.remove(), 3);
        assertEquals((int)linkedList.removeLast(), 1);
        assertEquals((int)linkedList.remove(), 2);

    }

    @Test
    public void testRemove() {

        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);
        assertEquals((int)linkedList.remove(), 3);
        assertEquals((int)linkedList.removeLast(), 1);
        assertEquals((int)linkedList.remove(), 2);

    }

    @Test
    public void testRemoveLast() {

        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);
        assertEquals((int)linkedList.removeLast(), 1);
        assertEquals((int)linkedList.remove(), 3);
        assertEquals((int)linkedList.removeLast(), 2);

    }

    @Test
    public void testToString() {

        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);

        assertEquals("[ 3 2 1 ]", linkedList.toString());

    }
}
