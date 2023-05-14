import org.junit.Test;
import static org.junit.Assert.*;
public class StackTest {

    Stack<Integer> stack;

    public StackTest(){

        stack = new Stack<Integer>();

    }

    @Test
    public void testGetSize() {

        assertEquals(stack.getSize(), 1);

    }

    @Test
    public void testPeek() {

        stack.push(0);

        assertEquals((int)stack.peek(), 0);

        stack.pop();

    }

    @Test
    public void testPop() {

        stack.push(0);
        stack.push(1);
        stack.push(2);
        assertEquals((int)stack.pop(), 2);
        assertEquals((int)stack.pop(), 1);
        assertEquals((int)stack.pop(), 0);

    }

    @Test
    public void testPush() {

        stack.push(0);
        assertEquals((int)stack.peek(), 0);
        stack.push(1);
        assertEquals((int)stack.peek(), 1);
        stack.push(2);
        assertEquals((int)stack.peek(), 2);
        stack.pop();
        stack.pop();
        stack.pop();
        
    }

    @Test
    public void testToString() {

        stack.push(0);
        stack.push(1);
        assertEquals(stack.toString(), "[ 1 0 ]\n");

    }
}
