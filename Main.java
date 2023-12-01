package org.example;


public class Main {
    public static void main(String[] args) {

        //  initialisation of stack
        ManualStack<Integer> st= new ManualStack();
        st.push(70); // 70
        st.push(30); // 70 30
        st.push(56); // 70 30 56

        //UC2 peek and pop method
        st.peek(); // 56
        st.pop();
        st.display(); // 70 30
        st.size(); // 2

        // UC3 initialisation and enqueue in queue
        ManualQueue<Integer> q= new ManualQueue();
        q.enqueue(56); //56
        q.enqueue(30); // 30 56
        q.enqueue(70); // 70 30 56


        // UC4 dequeue in queue
        q.dequeue(); // 70 30
        q.dequeue(); // 70
        q.display(); // 70
        q.size();  // 1

    }
};
