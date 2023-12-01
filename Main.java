package org.example;


public class Main {
    public static void main(String[] args) {

        //  initialisation of stack
        Stack st= new Stack();
        st.push(70); // 70
        st.push(30); // 70 30
        st.push(56); // 70 30 56

        //UC2 peek and pop method
        st.peek(); // 56
        st.pop();
        st.display(); // 70 30


    }
};
