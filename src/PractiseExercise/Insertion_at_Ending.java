package PractiseExercise;

public class Insertion_at_Ending {
    static class node {
        int data;
        node next;
        node(int value) {
            data = value;
            next = null;
        }
    }

    static node head;

    // display the list
    static void printlist() {
        node p = head;
        System.out.print("\n[");
        while (p != null) {
            System.out.print(" " + p.data + " ");
            p = p.next;
        }
        System.out.print("]");
    }

    // insert at the Beginning
    static void insertatbegin(int data) {
        node lk = new node(data);
        lk.next = head;
        head = lk;
    }

    // insert at the End
    static void insertatend(int data) {
        node lk = new node(data);
        if (head == null) {
            head = lk;
            return;
        }
        node linkedlist = head;
        while (linkedlist.next != null) {
            linkedlist = linkedlist.next;
        }
        linkedlist.next = lk;
    }

    public static void main(String args[]) {
        // insert the values
        insertatbegin(12);
        insertatbegin(22);
        insertatbegin(30);
        insertatend(44);
        insertatend(55);
        insertatend(33);
        System.out.println("Linked List: ");
        // print the list
        printlist();
    }
}