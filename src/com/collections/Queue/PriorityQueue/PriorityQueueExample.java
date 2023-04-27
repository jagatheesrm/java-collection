package com.collections.Queue.PriorityQueue;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Adding elements to the priority queue
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        System.out.println("Priority queue: " + queue);

        // Removing an element from the priority queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Priority queue after removing element: " + queue);
    }
}
