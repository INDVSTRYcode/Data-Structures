import org.junit.Test;
import static org.junit.Assert.*;
public class ArrayListTest {

    ArrayList<Integer> arrList;

    public ArrayListTest(){

        arrList = new ArrayList<Integer>();

    }
    @Test
    public void testAdd() {

        arrList.add(0);
        assertEquals(0, (int) arrList.get(0));

    }

    @Test
    public void testGet() {

        arrList.add(0);
        assertEquals(0, (int) arrList.get(0));

    }

    @Test
    public void testGetSize() {

        assertEquals(0, (int) arrList.getSize());
        arrList.add(0);
        assertEquals(1, (int) arrList.getSize());

    }

    @Test
    public void testIncreaseSize() {

        arrList.increaseSize();

    }

    @Test
    public void testRemove() {

        arrList.add(0);
        assertEquals(0, (int) arrList.remove(0));

    }

    @Test
    public void testToString() {

        arrList.add(0);
        arrList.add(4);
        assertEquals("0 4 ", arrList.toString());

    }
}
