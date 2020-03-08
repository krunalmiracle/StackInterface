package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack s;
    @Before
    public void setUp() throws Exception {
        s = new Stack<Integer>(5);
        s.push(1);
        s.push(2);
        s.push(3);

    }

    @Test
    public void push() {
        s.push(4);s.push(5);s.push(6);s.push(7);

    }

    @Test
    public void size() {
        assertEquals(4,s.size());
    }
}