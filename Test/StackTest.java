package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StackTest {
    @Test
    public void searchTestOnInteger() {
        ManualStack<Integer> st = new ManualStack<>();
        Assertions.assertEquals(null, st.peek());
        st.push(56);
        Assertions.assertEquals(56, st.peek());
        st.push(30);
        Assertions.assertEquals(30, st.peek());
        st.push(70);
        Assertions.assertEquals(70, st.peek());
        Assertions.assertEquals(70, st.pop());
        Assertions.assertEquals(2, st.size());
        Assertions.assertEquals(30, st.pop());
        Assertions.assertEquals(1, st.size());
        Assertions.assertEquals(56, st.pop());
        Assertions.assertEquals(0, st.size());
        Assertions.assertEquals(null, st.pop());
        Assertions.assertEquals(null, st.peek());
        Assertions.assertEquals(0, st.size());

    }

    @Test
    public void searchTestOnDouble() {
        ManualStack<Double> st = new ManualStack<>();
        Assertions.assertEquals(null, st.peek());
        st.push(56.0);
        Assertions.assertEquals(56, st.peek());
        st.push(30.0);
        Assertions.assertEquals(30, st.peek());
        st.push(70.0);
        Assertions.assertEquals(70, st.peek());
        Assertions.assertEquals(70, st.pop());
        Assertions.assertEquals(2, st.size());
        Assertions.assertEquals(30, st.pop());
        Assertions.assertEquals(1, st.size());
        Assertions.assertEquals(56, st.pop());
        Assertions.assertEquals(0, st.size());
        Assertions.assertEquals(null, st.pop());
        Assertions.assertEquals(null, st.peek());
        Assertions.assertEquals(0, st.size());

    }

    @Test
    public void searchTestOnCharacter() {
        ManualStack<Character> st = new ManualStack<>();
        Assertions.assertEquals(null, st.peek());
        st.push('a');
        Assertions.assertEquals('a', st.peek());
        st.push('3');
        Assertions.assertEquals('3', st.peek());
        st.push('c');
        Assertions.assertEquals('c', st.peek());
        Assertions.assertEquals('c', st.pop());
        Assertions.assertEquals(2, st.size());
        Assertions.assertEquals('3', st.pop());
        Assertions.assertEquals(1, st.size());
        Assertions.assertEquals('a', st.pop());
        Assertions.assertEquals(0, st.size());
        Assertions.assertEquals(null, st.pop());
        Assertions.assertEquals(null, st.peek());
        Assertions.assertEquals(0, st.size());
    }

    @Test
    public void searchTestOnString() {
        ManualStack<String> st = new ManualStack<>();
        Assertions.assertEquals(null, st.peek());
        st.push("apple");
        Assertions.assertEquals("apple", st.peek());
        st.push("mango");
        Assertions.assertEquals("mango", st.peek());
        st.push("banana");
        Assertions.assertEquals("banana", st.peek());
        Assertions.assertEquals("banana", st.pop());
        Assertions.assertEquals(2, st.size());
        Assertions.assertEquals("mango", st.pop());
        Assertions.assertEquals(1, st.size());
        Assertions.assertEquals("apple", st.pop());
        Assertions.assertEquals(0, st.size());
        Assertions.assertEquals(null, st.pop());
        Assertions.assertEquals(null, st.peek());
        Assertions.assertEquals(0, st.size());
    }
}