package com.collections.List.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Add some elements to the Vector
        vector.add("Alice");
        vector.add("Bob");
        vector.add("Charlie");

        // Print the Vector
        System.out.println(vector);

        // Retrieve an element from the Vector
        String element = vector.get(1);
        System.out.println("Element at index 1: " + element);

        // Replace an element in the Vector
        vector.set(1, "David");
        System.out.println("Vector after replacing element at index 1: " + vector);

        // Remove an element from the Vector
        vector.remove(2);
        System.out.println("Vector after removing element at index 2: " + vector);
    }
}
