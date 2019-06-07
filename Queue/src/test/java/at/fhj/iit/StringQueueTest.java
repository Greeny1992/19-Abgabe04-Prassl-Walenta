package at.fhj.iit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class  StringQueueTest {
    private StringQueue sq;

    /**
     * Before every test it creates a ne Queue of the size 4.
     */
    @Before
    public void setup(){
        sq = new StringQueue(4);
    }

    /**
     * This test verify if the adding of an element is successful
     */
    @Test
    public void testOffer1(){
        assertTrue(sq.offer("#YOLO"));
    }

    /**
     * Tests if it is possible to insert more elements than size of the queue.
     */
    @Test
    public void testOffer2(){
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        assertFalse(sq.offer("a"));
    }

    /**
     * tests if it possible to add 4 elements to a queue of the size 4
     */
    @Test
    public void testOffer3(){
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        assertTrue(sq.offer("a"));
    }

    /**
     * test if the element which is added is also the element we get with .poll()
     */
    @Test
    public void testPoll(){
        sq.offer("a");
        assertEquals("a",sq.poll());
    }

    /**
     * test if the method returns null, when the queue is empty
     */
    @Test
    public void testPoll2(){
        assertNull(sq.poll());
    }

    /**
     * test the case when we add two elements and we poll those two, if the order is correct
     */
    @Test
    public void testPoll3(){
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.poll());
        assertEquals("b", sq.poll());
    }

    /**
     * tries to remove a element form an empty queue. This should from a NoSuchElement exception
     */
    @Test(expected = NoSuchElementException.class)
    public void testRemove(){
        sq.remove();
    }

    /**
     * test the case when we add two elements and we remove those two, if the order is correct
     */
    @Test
    public void testRemove2(){
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.remove());
        assertEquals("b", sq.remove());
    }

    /**
     * when we add an element with the value "null" and remove this element it should return null
     */
    @Test
    public void testRemove3(){
        sq.offer(null);
        assertNull(sq.remove());
    }

    /**
     * Add two element and try two times to get the head of the queue. It always should be the same
     */
    @Test
    public void testPeek(){
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.peek());
        assertEquals("a", sq.peek());
    }

    /**
     * If we want the head, but the queue is empty it should return null
     */
    @Test
    public void testPeek2(){
        assertNull(sq.peek());
    }

    /**
     * If we want the head, but the queue is empty it should throw a NoSuchElementException
     */
    @Test(expected = NoSuchElementException.class)
    public void testElement(){
        sq.element();
    }

    /**
     * Add two element and try two times to get the head of the queue. It always should be the same
     */
    @Test
    public void testElement2(){
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.element());
        assertEquals("a", sq.element());
    }

    /**
     * when we add an element with the value "null" and try to get the head, this method should return null
     */
    @Test
    public void testElement3(){
        sq.offer(null);
        assertNull(sq.element());
        assertNull(sq.element());
    }


}
