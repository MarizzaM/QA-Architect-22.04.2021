package com.company;

public interface IMyPositive10mulStack {
    void push(int item) throws RuntimeExceptionPos10mul;
    int pop() throws EmptyStackExceptionPos10mul;
    int peek() throws EmptyStackExceptionPos10mul;
    void clear() throws EmptyStackExceptionPos10mul;
    int count() throws EmptyStackExceptionPos10mul;
}
