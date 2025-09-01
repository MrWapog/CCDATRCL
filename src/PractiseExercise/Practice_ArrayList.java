// java
package PractiseExercise;

// Doubly Linked List container
class LinkedList {
    Node head; // head of list

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }
}

public class Practice_ArrayList {
    public static void main(String[] args) {
        LinkedList linkList = new LinkedList();

        // Assign node values
        linkList.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);

        // Connect nodes: 1 -> 2 -> 3
        linkList.head.next = second;
        second.next = third;

        // Print node values
        LinkedList.Node current = linkList.head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}