package com.company;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MyPositive10mulStackTest {

    @Test
    public void test_MyPositive10mulStack_push_pos1()
    {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(10);

        // non atomic
        assertEquals(stack.count(), 1);
        assertEquals(stack.peek(), 10);

    }

    @Test
    public void test_MyPositive10mulStack_pop_pos1()
    {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(10);
        stack.pop();

        // non atomic
        assertEquals(stack.count(), 0);
    }

    @Test
    public void test_MyPositive10mulStack_peek_pos1()
    {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(10);
        int el = stack.peek();

        // non atomic
        assertEquals(stack.count(), 1);
        assertEquals(el, 10);
    }

    @Test
    public void test_MyPositive10mulStack_clear_pos1()
    {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(10);
        stack.clear();

        // non atomic
        assertEquals(stack.count(), 0);
    }

    @Test
    public void test_MyPositive10mulStack_count_pos1()
    {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(10);
        int size = stack.count();

        // non atomic
        assertEquals(size, 1);
    }

}
