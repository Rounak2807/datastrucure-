package org.example.stack;

public class Stack {
    private Node top;
    private int height;
    private int value;
    class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode =new Node(value);
        top=newNode;
        ++height;
    }
    public void printStack(){
        Node temp =top;
        while(temp!=null){
            System.out.println("Node value---"+temp.value);
            temp=temp.next;
        }
    }
    public int getHeight(){
        return height;
    }
    public Node getTopNode(){
    return top;
    }
}
