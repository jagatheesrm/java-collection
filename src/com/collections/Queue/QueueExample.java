package com.collections.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        System.out.println("Queue after adding elements: " + queue);

        // Removing an element from the queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removing element: " + queue);

        // Getting the head element of the queue
        String headElement = queue.element();
        System.out.println("Head element: " + headElement);
        System.out.println("Queue after getting head element: " + queue);
    }
}
