package stack;

import linearRegession.LinearRegression;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
        public void checkIfStackIsEmpty(){

    }

    @Test
    public void stackIsCreatedAndShouldPushAndPopOneElement() {
        stack.push(10);
        int result = stack.pop();
        assertEquals(10, result);
    }

    @Test
    void shouldFollow_lifo_order() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }
    @Test
        void shouldReturnMinusOneWhenEmpty() {
            assertEquals(-1, stack.pop());
    }
    @Test
            void shouldPeekTopElement(){
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
    }
    @Test
    void shouldKnowWhenEmpty(){

       assertTrue(stack.isEmpty());
    }
    @Test
        void shouldKnowWhenFull(){
        stack.push (1);
        stack.push (2);
        stack.push (3);
        stack.push (4);
        stack.push (5);

        assertTrue(stack.isFull());
    }
    @Test
        void shouldIgnorePushWhenFull(){
            stack.push (1);
            stack.push (2);
            stack.push (3);
            stack.push (4);
            stack.push (5);
            stack.push (6);

            assertEquals(5, stack.pop());

    }
}
