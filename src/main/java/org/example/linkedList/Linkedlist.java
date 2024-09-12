package org.example.linkedList;

public class Linkedlist {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            tail.next =newNode;
        }
        tail=newNode;++size;
    }
}
