package queueInArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue();
    }

    @Test
        public void queueIsEmptyAtTheStart_AndReturnsTrue(){assertTrue(queue.isEmpty());}
    @Test
        public void queueIsNoLongerEmptyAfter_FirstAdd(){
        queue.add(10);
        int result = queue.size();
        assertEquals(1, result);
    }
    @Test
        public void queueHasIncreasedAfter_SecondAdd(){
        queue.add(10);
        queue.add(20);
        assertEquals(2,queue.size());
    }
    
}
