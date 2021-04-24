package com.company;

import java.util.ArrayList;

public class MyPositive10mulStack implements IMyPositive10mulStack{

    ArrayList<Integer> m_items = new ArrayList<>();

    @Override
    public void push(int item) throws RuntimeException, RuntimeExceptionPos10mul {
        if (item > 0 && item%10 == 0){
            m_items.add(item);
        } else
            throw new RuntimeExceptionPos10mul
                    (String.format("%d is not positive number or can not be divided by 10 without reminder", item));
    }

    @Override
    public int pop() throws EmptyStackExceptionPos10mul {
        if(!m_items.isEmpty()){
            int item = m_items.get(m_items.size()-1);
            m_items.remove(m_items.size()-1);
            return item;
        } else {
            throw new EmptyStackExceptionPos10mul("Stack is null...");
        }
    }

    @Override
    public int peek() throws EmptyStackExceptionPos10mul {
        if(!m_items.isEmpty()){
            int item = m_items.get(m_items.size()-1);
            return item;
        } else
            throw new EmptyStackExceptionPos10mul("Stack is null...");
    }

    @Override
    public void clear() throws EmptyStackExceptionPos10mul {
        if(!m_items.isEmpty()){
            m_items.clear();
        } else
            throw new EmptyStackExceptionPos10mul("Stack is null...");
    }

    @Override
    public int count() throws EmptyStackExceptionPos10mul {
        if(!m_items.isEmpty()){
            return m_items.size();
        } else
            throw new EmptyStackExceptionPos10mul("Stack is null...");
    }
}
