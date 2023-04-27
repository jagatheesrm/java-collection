package com.collections.List.Vector.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of Integers
        Stack<Integer> stack = new Stack<>();

        // Push some elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the Stack
        System.out.println(stack);

        // Pop an element from the Stack
        int element = stack.pop();
        System.out.println("Popped element: " + element);

        // Print the Stack again
        System.out.println(stack);

        // Get the element at the top of the Stack without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
    }
}

