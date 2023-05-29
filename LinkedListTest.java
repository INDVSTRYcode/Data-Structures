import org.junit.Test;
import static org.junit.Assert.*;
public class LinkedListTest {

    LinkedList<Integer> linkedList;

    public LinkedListTest(){

        linkedList = new LinkedList<>();

    }
    @Test
    public void testAddToEnd() {

        linkedList.addToFront(1);
        linkedList.addToEnd(3);
        linkedList.insertAfter(1, 2);
        linkedList.addToFront(0);
        assertEquals(3, (int) linkedList.removeLast());

    }

    @Test
    public void testAddToFront() {

        linkedList.addToFront(1);
        linkedList.addToEnd(3);
        linkedList.insertAfter(1, 2);
        linkedList.addToFront(0);
        assertEquals(0, (int) linkedList.remove());

    }

    @Test
    public void testFetch() {

        linkedList.addToFront(1);
        assertEquals(1, (int) linkedList.fetch(1));

    }

    @Test
    public void testGetSize() {

        assertEquals(1, linkedList.getSize());
        linkedList.addToFront(1);
        assertEquals(2, linkedList.getSize());

    }

    @Test
    public void testInsertAfter() {

        linkedList.addToFront(1);
        linkedList.addToEnd(3);
        linkedList.insertAfter(1, 2);
        linkedList.addToFront(0);
        assertEquals(2, (int) linkedList.removeMiddle(2));

    }

    @Test
    public void testLocatePosition() {

        linkedList.addToFront(1);
        linkedList.addToEnd(3);
        linkedList.insertAfter(1, 2);
        linkedList.addToFront(0);
        assertEquals(0, (int) linkedList.locatePosition(0));

    }

    @Test
    public void testRemove() {

        linkedList.addToFront(1);
        linkedList.addToEnd(3);
        linkedList.insertAfter(1, 2);
        linkedList.addToFront(0);
        assertEquals(0, (int) linkedList.remove());

    }

    @Test
    public void testRemoveLast() {

        linkedList.addToFront(1);
        linkedList.addToEnd(3);
        linkedList.insertAfter(1, 2);
        linkedList.addToFront(0);
        assertEquals(3, (int) linkedList.removeLast());

    }

    @Test
    public void testRemoveMiddle() {

        linkedList.addToFront(1);
        linkedList.addToEnd(3);
        linkedList.insertAfter(1, 2);
        linkedList.addToFront(0);
        assertEquals(2, (int) linkedList.removeMiddle(2));

    }

    @Test
    public void testSort() {

        linkedList.addToFront(9);
        linkedList.addToEnd(3);
        linkedList.insertAfter(3, 1);
        linkedList.addToFront(14);
        linkedList.sort();
        assertEquals("[ 1 3 9 14 ]", linkedList.toString());

    }

    @Test
    public void testToString() {

        linkedList.addToFront(1);
        linkedList.addToEnd(3);
        linkedList.insertAfter(1, 2);
        linkedList.addToFront(0);
        assertEquals("[ 0 1 2 3 ]", linkedList.toString());

    }
}
