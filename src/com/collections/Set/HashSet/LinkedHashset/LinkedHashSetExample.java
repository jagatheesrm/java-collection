package com.collections.Set.HashSet.LinkedHashset;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Integers
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add some elements to the Set
        set.add(5);
        set.add(2);
        set.add(8);

        // Print the Set
        System.out.println("Set elements: " + set);

        // Check if an element is present in the Set
        boolean isPresent = set.contains(5);
        System.out.println("Is 5 present in Set? " + isPresent);

        // Remove an element from the Set
        boolean isRemoved = set.remove(2);
        System.out.println("Is 2 removed from Set? " + isRemoved);

        // Print the Set after removal
        System.out.println("Set elements after removal: " + set);

        // Get the first and last elements of the Set
        int firstElement = set.iterator().next();
        int lastElement = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            lastElement = iterator.next();
        }
        System.out.println("First element of Set: " + firstElement);
        System.out.println("Last element of Set: " + lastElement);

        // Iterate through the Set using an Iterator
        Iterator<Integer> it = set.iterator();
        System.out.print("Set elements using Iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
