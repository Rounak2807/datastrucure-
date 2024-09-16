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
    public Node removeLastNode(){
        if(size==0){return null;}
        Node pre =head;
        Node temp =head;
        while(temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail =pre;
        tail.next =null;
        size--;
        if(size==0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        ++size;
    }
    public Node removeFirst() {
        if(size==0)return null;
        Node temp =head;
        head = temp.next;
        temp.next = null;
        --size;
        if(size==0){
            tail=null;
        }
        return temp;
    }

    public Node get(int index) {
        Node temp =head;
         if(index<0 || index>=size){
             return null;}
         int i=0;
         while(i<index){
            temp = temp.next;
            i++;
        }        return temp;
    }
    public boolean set(int index,int value){
        Node temp = get(index);
        if(temp!=null){
            temp.data = value;
            return true;
        }else{
            return false;
        }
        //return temp;
    }

    public Node insertLast(int data){
        Node newNode = new Node(data);
        tail.next=newNode;
        tail=newNode;
        return newNode;
    }

    public boolean insert(int index,int value){
        if(index<0 ||index>=size) return false;
        if(index==0){
            insertFirst(value);
            ++size;
            return true;
        }
        if(index==size-1){
            insertLast(value);
            ++size;
            return true;
        }
        Node prev =get(index-1);
        if(prev!=null){
            Node newNode = new Node(value);
            newNode.next=prev.next;
            prev.next=newNode;
            ++size;
            return true;
        }
        else{return false;}
    }
    public boolean removeAtIndex(int index){
        if(index<0 ||index>=size)return false;
        if(index==0){
            removeFirst();return true;
        }
        if(index==size-1){
            removeLastNode();return true;
        }
        Node previous = get(index-1);
        Node temp = previous.next;
        previous.next= temp.next;
        temp.next=null;
        --size;
        return true;
    }
    public void reverseLinkedList(){
        Node temp = head;
        head=tail;
        tail = temp;
        Node before = null;
        Node after =temp;
        for(int i=0; i<size;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp=after;
        }

    }

    public void removeDuplicates(){


    }


}
