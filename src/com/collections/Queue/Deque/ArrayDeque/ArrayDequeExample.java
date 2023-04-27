package com.collections.Queue.Deque.ArrayDeque;
import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an empty ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and back of the deque
        deque.addFirst("Alice");
        deque.addLast("Charlie");
        deque.addFirst("Bob");

        // Print the deque
        System.out.println(deque);

        // Remove elements from the front and back of the deque
        String first = deque.removeFirst();
        String last = deque.removeLast();

        // Print the removed elements
        System.out.println("Removed elements: " + first + ", " + last);

        // Print the deque again
        System.out.println(deque);

        // Retrieve the first and last elements without removing them
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();

        // Print the first and last elements
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}
