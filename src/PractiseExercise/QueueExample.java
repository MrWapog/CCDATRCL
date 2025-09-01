// src/PractiseExercise/QueueExample.java
package PractiseExercise;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("Cherry");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove elements at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + queue);

        // add another element to the queue
        queue.add("date");

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked Element: " + peeked);

        // print the final state of the queue
        System.out.println("Queue after peek: " + queue);
    }
}
