package org.example;

public class Stack {
    private Node head;
    private int size;
    public Stack(){
        head=null;
        size=0;
    }
    /*
    @desc: add items to the stack and increase the current size of stack
     */
    public  void push(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;

        }
        size++;
    }

    // display the elements of stack
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
