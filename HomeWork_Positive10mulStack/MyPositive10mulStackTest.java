package com.company;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MyPositive10mulStackTest {

    private ArrayList<Integer> get_m_items(MyPositive10mulStack stack) {
        try {
            // reflection in order to get the m_items.....
            ArrayList<Integer> m_items = null; // m_items
            Field privateStringField = null;
            privateStringField = MyPositive10mulStack.class.
                    getDeclaredField("m_items");
            privateStringField.setAccessible(true);
            m_items = (ArrayList<Integer>) privateStringField.get(stack);
            // i got the m_items
            return m_items;
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
//========== PUSH ==========
    @Test
    public void test_MyPositive10mulStack_push_pos1() throws RuntimeExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(10);

        ArrayList<Integer> m_items = get_m_items(stack);

        assertEquals(1, m_items.size());
        assertEquals(10, (int)m_items.get(0));
    }

    @Test
    public void test_MyPositive10mulStack_push_pos2() throws RuntimeExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(10);
        stack.push(20);

        ArrayList<Integer> m_items = get_m_items(stack);
        assertEquals(2, m_items.size());
        assertEquals(10, (int)m_items.get(0));
        assertEquals(20, (int)m_items.get(1));
    }

    @Test (expected = RuntimeExceptionPos10mul.class)
    public void test_MyPositive10mulStack_push_negative() throws RuntimeExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        stack.push(1);
    }
    //========== POP ==========
    @Test
    public void test_MyPositive10mulStack_pop_pos1() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();

        ArrayList<Integer> m_items = get_m_items(stack);

        m_items.add(10);
        int item = stack.pop();

        assertEquals(m_items.size(), 0);
        assertEquals(item, 10);
    }

    @Test
    public void test_MyPositive10mulStack_pop_pos2() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();

        ArrayList<Integer> m_items = get_m_items(stack);

        m_items.add(10);
        m_items.add(20);
        int item = stack.pop();

        assertEquals(m_items.size(), 1);
        assertEquals(item, 20);
    }

    @Test (expected = EmptyStackExceptionPos10mul.class)
    public void test_MyPositive10mulStack_pop_negative() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();

        stack.pop();
    }
    //========== PEEK ==========
    @Test
    public void test_MyPositive10mulStack_peek_pos1() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        ArrayList<Integer> m_items = get_m_items(stack);

        m_items.add(10);
        int item = stack.peek();

        assertEquals(m_items.size(), 1);
        assertEquals(item, 10);
    }

    @Test
    public void test_MyPositive10mulStack_peek_pos2() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        ArrayList<Integer> m_items = get_m_items(stack);

        m_items.add(10);
        m_items.add(20);
        int item = stack.peek();

        assertEquals(m_items.size(), 2);
        assertEquals(item, 20);
    }

    @Test (expected = EmptyStackExceptionPos10mul.class)
    public void test_MyPositive10mulStack_peek_negative() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();

        stack.peek();
    }
    //========== CLEAR ==========
    @Test
    public void test_MyPositive10mulStack_clear_pos1() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        ArrayList<Integer> m_items = get_m_items(stack);

        m_items.add(10);
        stack.clear();

        assertEquals(m_items.size(), 0);
    }

    @Test
    public void test_MyPositive10mulStack_clear_pos2() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        ArrayList<Integer> m_items = get_m_items(stack);

        m_items.add(10);
        m_items.add(20);
        stack.clear();

        assertEquals(m_items.size(), 0);
    }

    @Test (expected = EmptyStackExceptionPos10mul.class)
    public void test_MyPositive10mulStack_clear_negative() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();

        stack.clear();
    }
    //========== COUNT ==========
    @Test
    public void test_MyPositive10mulStack_count_pos1() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        ArrayList<Integer> m_items = get_m_items(stack);

        m_items.add(10);

        assertEquals(m_items.size(), stack.count());
    }

    @Test
    public void test_MyPositive10mulStack_count_pos2() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();
        ArrayList<Integer> m_items = get_m_items(stack);

        m_items.add(10);
        m_items.add(20);

        assertEquals(m_items.size(), stack.count());
    }

    @Test (expected = EmptyStackExceptionPos10mul.class)
    public void test_MyPositive10mulStack_count_negative() throws EmptyStackExceptionPos10mul {
        MyPositive10mulStack stack = new MyPositive10mulStack();

        stack.count();
    }
}
