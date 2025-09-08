package Midterms;

import java.util.*;

class Customer {
    String name;
    int requestedTickets;

    Customer(String name, int requestedTickets) {
        this.name = name;
        this.requestedTickets = requestedTickets;
    }
}

class TheaterTicketSystem {
    private Queue<Customer> queue = new LinkedList<>();
    private int totalTickets = 20;  // N0. for fix tickets

    public void addCustomer(String name, int requestedTickets) {
        queue.add(new Customer(name, requestedTickets));
    }
    //output ng customer name and tickets requested
    public void processQueue() {
        System.out.println("=== SM Ticket Booth(leg) ==="); // Name para mas cute

        System.out.println("\nTheater Tickets : " + totalTickets);
        System.out.println("==============================");

        while (!queue.isEmpty()) {
            Customer c = queue.poll();

            System.out.println("Customer Name : " + c.name);
            System.out.println("Availed Ticket : " + c.requestedTickets);

            if (c.requestedTickets <= totalTickets) {
                totalTickets -= c.requestedTickets;
                System.out.println("Status : Approved");
                System.out.println("Remaining Tickets : " + totalTickets);
            } else {
                System.out.println("Status : Rejected (Not enough tickets)");
                System.out.println("Remaining Tickets : " + totalTickets);
            }
            System.out.println("------------------------------");
        }

        if (totalTickets == 0) {
            System.out.println("All tickets are sold out!");
        } else {
            System.out.println("Tickets still available: " + totalTickets);
        }
    }
}
// input ng customer name and tickets requested
public class Activity_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TheaterTicketSystem system = new TheaterTicketSystem(); // Fixed Ticket NO.
        System.out.println("=== SM Ticket Booth(leg) ===");
        // Add customers para mas better
        String choice;
        do {
            System.out.println("------------------------------");
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of tickets requested: ");
            int tickets = sc.nextInt();
            sc.nextLine(); // consume newline

            system.addCustomer(name, tickets);

            System.out.print("Add another customer? (yes/no): ");
            choice = sc.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        // Process the queue
        system.processQueue();
    }
}

