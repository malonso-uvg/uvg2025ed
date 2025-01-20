package edu.uvg.example;

public class Main {
    public static void main(String[] args) {
        // Usando StackWithArray
        IStack<Integer> arrayStack = new StackWithArray<>(5);
        arrayStack.push(1);
        arrayStack.push(2);
        System.out.println("Array Stack Top: " + arrayStack.peek()); // 2
        System.out.println("Array Stack Popped: " + arrayStack.pop()); // 2

        // Usando StackWithNodes
        IStack<String> nodeStack = new StackWithNodes<>();
        nodeStack.push("A");
        nodeStack.push("B");
        System.out.println("Node Stack Top: " + nodeStack.peek()); // B
        System.out.println("Node Stack Popped: " + nodeStack.pop()); // B
    }
}
