package org.example;

public class ManualQueue<T> {
    Node<T> head;
    int size;
    public ManualQueue(){
        head=null;
        size=0;
    }
    // add items in queue
    public void enqueue(T data){
        Node <T>newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }
    // remove element from beginning
    public T dequeue(){
        if(size==0) return null;
        if(size==1){
            T res= head.data;
            head=null;
            size=0;
            return res;
        }
        Node prev=head;
        Node curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        size--;
        return (T)curr.data;
    }

    // return size of the current queue
    public int size(){
        return size;
    }
    // print the queue
    public void display (){
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
