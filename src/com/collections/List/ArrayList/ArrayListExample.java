package com.collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Fig");

        System.out.println("Fruits: " + fruits);

        // Removing an element from the ArrayList
        fruits.remove("Cherry");
        System.out.println("After removing Cherry: " + fruits);

        // Replacing an element in the ArrayList
        fruits.set(1, "Grape");
        System.out.println("After replacing Banana with Grape: " + fruits);

        // Getting an element from the ArrayList
        String fruit = fruits.get(2);
        System.out.println("Third element: " + fruit);

        // Finding the index of an element in the ArrayList
        int index = fruits.indexOf("Fig");
        System.out.println("Index of Fig: " + index);

        // Finding the last index of an element in the ArrayList
        int lastIndex = fruits.lastIndexOf("Apple");
        System.out.println("Last index of Apple: " + lastIndex);

        // Checking if the ArrayList is empty
        boolean empty = fruits.isEmpty();
        System.out.println("Is the list empty? " + empty);

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);

        // Checking if the ArrayList is empty again
        empty = fruits.isEmpty();
        System.out.println("Is the list empty now? " + empty);
    }
}

