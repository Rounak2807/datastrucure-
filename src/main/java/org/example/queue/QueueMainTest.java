package org.example.queue;

public class QueueMainTest {
    public static void main(String[] args) throws Exception {

        Queue queue = new Queue(19);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }
}
