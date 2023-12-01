package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void searchTestOnInteger() {
        ManualQueue<Integer> q = new ManualQueue<>();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        Assertions.assertEquals(56,q.dequeue());
        Assertions.assertEquals(2,q.size());
        Assertions.assertEquals(30, q.dequeue());
        Assertions.assertEquals(1,q.size());
        Assertions.assertEquals(70, q.dequeue());
        Assertions.assertEquals(0,q.size());
        Assertions.assertEquals(null, q.dequeue());
        Assertions.assertEquals(0,q.size());

    }

    @Test
    public void searchTestOnDouble() {
        ManualQueue<Double> q = new ManualQueue<>();
        q.enqueue(56.0);
        q.enqueue(30.0);
        q.enqueue(70.0);
        Assertions.assertEquals(56,q.dequeue());
        Assertions.assertEquals(2,q.size());
        Assertions.assertEquals(30, q.dequeue());
        Assertions.assertEquals(1,q.size());
        Assertions.assertEquals(70, q.dequeue());
        Assertions.assertEquals(0,q.size());
        Assertions.assertEquals(null, q.dequeue());
        Assertions.assertEquals(0,q.size());

    }

    @Test
    public void searchTestOnCharacter() {
        ManualQueue<Character> q = new ManualQueue<>();
        q.enqueue('a');
        q.enqueue('b');
        q.enqueue('c');
        Assertions.assertEquals('a',q.dequeue());
        Assertions.assertEquals(2,q.size());
        Assertions.assertEquals('b', q.dequeue());
        Assertions.assertEquals(1,q.size());
        Assertions.assertEquals('c', q.dequeue());
        Assertions.assertEquals(0,q.size());
        Assertions.assertEquals(null, q.dequeue());
        Assertions.assertEquals(0,q.size());
    }

    @Test
    public void searchTestOnString() {

        ManualQueue<String> q = new ManualQueue<>();
        q.enqueue("apple");
        q.enqueue("mango");
        q.enqueue("orange");
        Assertions.assertEquals("apple",q.dequeue());
        Assertions.assertEquals(2,q.size());
        Assertions.assertEquals("mango", q.dequeue());
        Assertions.assertEquals(1,q.size());
        Assertions.assertEquals("orange", q.dequeue());
        Assertions.assertEquals(0,q.size());
        Assertions.assertEquals(null, q.dequeue());
        Assertions.assertEquals(0,q.size());
    }

}