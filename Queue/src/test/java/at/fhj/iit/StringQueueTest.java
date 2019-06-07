package at.fhj.iit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class  StringQueueTest {
    private StringQueue sq;

    @Before
    public void setup(){
        sq = new StringQueue(4);
    }

    @Test
    public void testOffer1(){
        assertTrue(sq.offer("#YOLO"));
    }

    @Test
    public void testOffer2(){
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        assertFalse(sq.offer("a"));
    }

    @Test
    public void testOffer3(){
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        assertTrue(sq.offer("a"));
    }

    @Test
    public void testPoll(){
        sq.offer("a");
        assertEquals("a",sq.poll());
    }

    @Test
    public void testPoll2(){
        assertNull(sq.poll());
    }

    @Test
    public void testPoll3(){
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.poll());
        assertEquals("b", sq.poll());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemove(){
        sq.remove();
    }

    @Test
    public void testRemove2(){
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.remove());
        assertEquals("b", sq.remove());
    }

    @Test
    public void testRemove3(){
        sq.offer(null);
        assertNull(sq.remove());
    }



    @Test
    public void testPeek(){
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.peek());
        assertEquals("a", sq.peek());
    }
    @Test
    public void testPeek2(){
        assertNull(sq.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void testElement(){
        sq.element();
    }

    @Test
    public void testElement2(){
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.element());
        assertEquals("a", sq.element());
    }

    @Test
    public void testElement3(){
        sq.offer(null);
        assertNull(sq.element());
        assertNull(sq.element());
    }


}
