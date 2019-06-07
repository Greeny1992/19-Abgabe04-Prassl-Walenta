package at.fhj.iit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class  StringQueueTest {
    private StringQueue sq;

    @Before
    public void setup() throws Exception{
        sq = new StringQueue(5);
    }

    @Test
    public void testOffer1() throws Exception{
        assertTrue(sq.offer("#YOLO"));
    }

    @Test
    public void testOffer2() throws Exception{
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        assertFalse(sq.offer("a"));
    }

    @Test
    public void testOffer3() throws Exception{
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        sq.offer("a");
        assertTrue(sq.offer("a"));
    }

    @Test
    public void testPoll() throws Exception{
        sq.offer("a");
        assertEquals("a",sq.poll());
    }

    @Test
    public void testPoll2() throws Exception{
        assertEquals(null,sq.poll());
    }

    @Test
    public void testPoll3() throws Exception{
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.poll());
        assertEquals("b", sq.poll());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemove() throws  Exception{
        sq.remove();
    }

    @Test
    public void testRemove2() throws  Exception{
        sq.offer("a");
        sq.offer("b");
        assertEquals("a",sq.remove());
        assertEquals("b", sq.remove());
    }

    @Test
    public void testRemove3() throws  Exception{
        sq.offer(null);
        assertEquals(null,sq.remove());
    }
}
