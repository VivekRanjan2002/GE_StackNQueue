package org.example;

public class Queue {
    Node head;
    int size;
    public Queue(){
        head=null;
        size=0;
    }
    // add items in queue
    public void enqueue(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }
    // remove element from beginning
    public void dequeue(){
        if(size==0) return;
        Node prev=head;
        Node curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        size--;
    }

    // return size of the current queue
    public int size(){
        return size;
    }
    // print the queue
    public void display (){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
