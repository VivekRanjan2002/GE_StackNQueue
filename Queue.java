package org.example;

public class Queue {
    Node head;
    int size;
    public Queue(){
        head=null;
        size=0;
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void display (){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
