import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree binarySearchTree;

    public BinarySearchTreeTest(){

        binarySearchTree = new BinarySearchTree();

    }

    @Test
    public void testAdd() {

        binarySearchTree.add(1);
        assertEquals(true, binarySearchTree.containsNode(1));

    }

    @Test
    public void testContainsNode() {

        binarySearchTree.add(1);
        assertEquals(false, binarySearchTree.containsNode(2));
        assertEquals(true, binarySearchTree.containsNode(1));

    }

    @Test
    public void testDeleteNode() {

        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        assertEquals(true, binarySearchTree.containsNode(3));
        binarySearchTree.delete(3);
        assertEquals(false, binarySearchTree.containsNode(3));

    }

}
