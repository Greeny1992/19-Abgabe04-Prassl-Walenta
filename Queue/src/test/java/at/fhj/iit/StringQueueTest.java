package at.fhj.iit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringQueueTest {
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
        assertFalse(sq.offer("a"));
    }
}
