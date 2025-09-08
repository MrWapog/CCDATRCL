package Midterms;

import java.util.*;

class Attendee {
    String name;
    int requestedTickets;
    boolean isVIP;

    Attendee(String name, int requestedTickets, boolean isVIP) {
        this.name = name;
        this.requestedTickets = requestedTickets;
        this.isVIP = isVIP;
    }
}

class TicketBooth {
    private Queue<Attendee> vipQueue = new LinkedList<>();
    private Queue<Attendee> regularQueue = new LinkedList<>();
    private int totalTickets = 20;  // fixed tickets

    // add attendee depending if VIP or not
    public void addAttendee(String name, int requestedTickets, boolean isVIP) {
        if (isVIP) {
            vipQueue.add(new Attendee(name, requestedTickets, true));
        } else {
            regularQueue.add(new Attendee(name, requestedTickets, false));
        }
    }

    // display waiting list BEFORE processing para cute
    public void showWaitingList() {
        System.out.println("\nWaiting List Preview:");
        System.out.println("VIP Queue:");
        if (vipQueue.isEmpty()) {
            System.out.println("   (No VIP Attendees)");
        } else {
            for (Attendee a : vipQueue) {
                System.out.println("   - " + a.name + " (VIP), requested " + a.requestedTickets + " tickets");
            }
        }

        System.out.println("Regular Queue:");
        if (regularQueue.isEmpty()) {
            System.out.println("   (No Regular Attendees)");
        } else {
            for (Attendee a : regularQueue) {
                System.out.println("   - " + a.name + ", requested " + a.requestedTickets + " tickets");
            }
        }
        System.out.println("==============================================");
    }

    // output ng attendee name and tickets requested
    public void processQueue() {
        System.out.println("==============================================");
        System.out.println("===++SM Ticket Booth(leg)++===");
        System.out.println("\nTotal Theater Tickets : " + totalTickets);
        System.out.println("==============================================");

        // show waiting list first
        showWaitingList();

        // process VIP first
        while (!vipQueue.isEmpty()) {
            serveAttendee(vipQueue.poll());
        }

        // then process regular attendees
        while (!regularQueue.isEmpty()) {
            serveAttendee(regularQueue.poll());
        }

        if (totalTickets == 0) {
            System.out.println("All tickets are sold out!");
        } else {
            System.out.println("Tickets still available: " + totalTickets);
        }
    }

    // serve one attendee
    private void serveAttendee(Attendee a) {
        System.out.println("Attendee Name : " + a.name + (a.isVIP ? " (VIP)" : ""));
        System.out.println("Availed Ticket : " + a.requestedTickets);

        if (a.requestedTickets <= totalTickets) {
            totalTickets -= a.requestedTickets;
            System.out.println("Status : Approved");
            System.out.println("Remaining Tickets : " + totalTickets);
        } else {
            System.out.println("Status : Rejected (Not enough tickets)");
            System.out.println("Remaining Tickets : " + totalTickets);
        }
        System.out.println("----------------------------------------------");
    }
}

// input ng attendee name and tickets requested
public class Activity_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TicketBooth booth = new TicketBooth(); // fixed at 20 tickets
        System.out.println("=== SM Ticket Booth(leg) ===");

        // Add attendees (interactive input)
        String choice;
        do {
            System.out.println("------------------------------");
            System.out.print("Enter attendee name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of tickets requested: ");
            int tickets = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Is this attendee VIP? (yes/no): ");
            boolean isVIP = sc.nextLine().equalsIgnoreCase("yes");

            booth.addAttendee(name, tickets, isVIP);

            System.out.print("Add another attendee? (yes/no): ");
            choice = sc.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        // Process the queue
        booth.processQueue();
    }
}
