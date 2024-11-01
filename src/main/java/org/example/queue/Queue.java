package org.example.queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;
    class Node{
        int value;
        Node next;
        public Node(int value) {
         this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        if(temp==null){
            System.out.println("Queue is empty");
            return;
        }
        while(temp != null){
            System.out.println("Queue value:----"+temp.value);
            temp = temp.next;
        }
    }

    public void enQueue(int value){
        Node newNode = new Node(value);
        if(length==0|| first==null){
            first = newNode;
            last=newNode;
        }
        last.next=newNode;
        last =newNode;
        ++length;
    }
    public Node dequeue(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("a");
        buffer.toString();
        if(length==0){return null;}
        Node temp = first;
        if(length==1){
            last=null;
            first= null;
        }else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
