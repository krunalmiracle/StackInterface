package com.company;

public interface StackInterface<T> {
    int push(T element);
    T pop();
    int size();
}
