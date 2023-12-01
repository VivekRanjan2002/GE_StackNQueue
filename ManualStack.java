package org.example;

public class ManualStack<T>{
    private Node<T> head;
    private int size;
    public ManualStack(){
        head=null;
        size=0;
    }
    /*
    @desc: add items to the stack and increase the current size of stack
     */
    public  void push(T data){
        Node <T> newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node<T> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;

        }
        size++;
    }
 // return the top element of stack

    public T peek(){
        if(head==null) return null;
        Node <T>temp=head;
        while(temp.next!=null) temp=temp.next;
        return  temp.data;
    }
    // pop top element of stack
    public T pop(){
        if(head==null) return null ;
        if(head.next==null){
            size=0;
            T res= head.data;
            head=null;
            return res;
        }
        Node<T>prev=head;
        Node<T> curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }

        prev.next=null;
        size--;
        return curr.data;
    }
     public int size(){
        return size;
     }
    // display the elements of stack
    public void display(){
        Node<T>temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
