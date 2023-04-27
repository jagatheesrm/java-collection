package com.collections.Set.Sortedset.Treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Integers
        SortedSet<Integer> set = new TreeSet<>();

        // Add some elements to the Set
        set.add(5);
        set.add(2);
        set.add(8);

        // Print the Set
        System.out.println("Set elements: " + set);

        // Get the first and last elements of the Set
        int firstElement = set.first();
        int lastElement = set.last();
        System.out.println("First element of Set: " + firstElement);
        System.out.println("Last element of Set: " + lastElement);

        // Get a view of the portion of the set less than 5
        SortedSet<Integer> headSet = set.headSet(5);
        System.out.println("Elements less than 5: " + headSet);

        // Get a view of the portion of the set greater than or equal to 5
        SortedSet<Integer> tailSet = set.tailSet(5);
        System.out.println("Elements greater than or equal to 5: " + tailSet);

        // Get a view of the portion of the set between 2 and 8 (exclusive)
        SortedSet<Integer> subSet = set.subSet(2, 8);
        System.out.println("Elements between 2 (inclusive) and 8 (exclusive): " + subSet);
    }
}
