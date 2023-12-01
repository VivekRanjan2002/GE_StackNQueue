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
 // return the top element of stack
    public int peek(){
        if(head==null) return -1;
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        return temp.data;
    }
    // pop top element of stack
    public void pop(){
        if(head==null) return;
        Node prev=head;
        Node curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        size--;
    }
     public int size(){
        return size;
     }
    // display the elements of stack
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
