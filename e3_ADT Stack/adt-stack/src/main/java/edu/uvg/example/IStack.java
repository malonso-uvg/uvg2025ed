package edu.uvg.example;

public interface IStack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
