import org.junit.Test;
import static org.junit.Assert.*;
public class QueueTest {

    Queue<Integer> queue;

    public QueueTest(){

        queue = new Queue<Integer>();

    }

    @Test
    public void testDeQueue() {

        queue.enQueue(1);
        queue.enQueue(2);
        assertEquals(1, (int)queue.deQueue());
        assertEquals(2, (int)queue.deQueue());

    }

    @Test
    public void testRemove() {

        queue.enQueue(1);
        assertEquals(1, (int)queue.remove());

    }

    @Test
    public void testEnQueue() {

        queue.enQueue(1);
        assertEquals(1, (int)queue.peek());
        queue.deQueue();

    }

    @Test
    public void testPeek() {

        queue.enQueue(1);
        assertEquals(1, (int)queue.peek());
        queue.deQueue();

    }

    @Test
    public void testGetSize() {

        assertEquals(1, queue.getSize());

    }

    @Test
    public void testToString() {

        queue.enQueue(0);
        queue.enQueue(1);
        assertEquals("[ 1 0 ]\n", queue.toString());

    }

    @Test
    public void testLocatePosition() {

        queue.enQueue(2);
        assertEquals(queue.locatePosition(0), 2);
        
    }    

}
