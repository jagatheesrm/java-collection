package com.collections.Set.Sortedset.Treeset;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Check if the TreeSet contains an element
        if (treeSet.contains("banana")) {
            System.out.println("TreeSet contains 'banana'");
        }

        // Get the first and last elements of the TreeSet
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Remove the first and last elements of the TreeSet
        treeSet.pollFirst();
        treeSet.pollLast();

        // Print the TreeSet after removal
        System.out.println("TreeSet after removal: " + treeSet);

        // Clear the TreeSet
        treeSet.clear();

        // Check if the TreeSet is empty
        if (treeSet.isEmpty()) {
            System.out.println("TreeSet is empty");
        }
    }
}
