package org.example.stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(10);
        stack.push(30);
        stack.printStack();
        stack.pop();
        //After pop
        stack.printStack();
    }
}
