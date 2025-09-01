package Midterms;
import java.util.LinkedList;
import java.util.Scanner;

public class Activity_3 {
    public static void main(String[] args) {
        // Import the necessary classes
        // LinkedList for dynamic array functionality
        // Scanner for user input

        // Initialize Scanner and LinkedList
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        int choice;

        System.out.println("=== Activity 3 ===");

        // The program runs in a loop until exit
        do {
            // Menu options
            System.out.println("\nMenu:");
            System.out.println("1 - Add number");
            System.out.println("2 - Remove number");
            System.out.println("3 - View total count");
            System.out.println("4 - Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a number
                    System.out.print("Enter number to add: ");
                    numbers.add(scanner.nextInt());  // add number
                    System.out.println("Number added!");
                    System.out.println("Current total elements: " + numbers.size());  // show updated size
                    break;

                case 2:
                    // Remove a number
                    if (numbers.isEmpty()) {
                        // If no numbers exist, can't remove
                        System.out.println("List is empty, nothing to remove.");
                    } else {
                        System.out.print("Enter index to remove (0 to " + (numbers.size() - 1) + "): ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < numbers.size()) {
                            numbers.remove(index);  // remove at given index
                            System.out.println("Number removed!");
                            System.out.println("Current total elements: " + numbers.size());  // show updated size
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 3:
                    // view the total number of elements
                    System.out.println("Total number of elements right now: " + numbers.size());
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting program...");
                    break;

                default:
                    // If input is not 1-4
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);  // Loop ends when user picks 4
        // Loop ends when user picks 41
        scanner.close();
    }
}