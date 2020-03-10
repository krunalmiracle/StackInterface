package com.company;

import java.util.List;
import java.util.Vector;

public class Stack<T> implements StackInterface<T> {
    //private Vector<Integer> _stack ;
    private List _stack ;
    private int _length;

    public Stack(int length){
        //Creates a vector of length
        //_stack = new Vector<Integer>(length);
        //Don't know which one is right one!!
        _stack = new Vector<T>();
        for(int i = 0;i < _length; i++)
            _stack.add(null);
        _length = length;
    }

    @Override
    public int push(T element){
        if (_stack.size()<=_length)
        {
            _stack.add(element);
            return 0;
        }
        else
        {
            //Do nothing
            return -1;
        }
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public int size(){
        return _stack.size();
    }
}
