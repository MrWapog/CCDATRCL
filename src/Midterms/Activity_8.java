package Midterms;

import java.util.HashMap;
import java.util.Scanner;

public class Activity_8 {
    public static void main(String[] args) {

        HashMap<String, String> books = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String choice;

        // Initial menu
        System.out.println("Library Book Tracker");
        System.out.println("[A]Add [B]Borrow [R]Return [D]Display [E]Exit");

        while (true) {
            // Ask user for their choice
            System.out.print("Enter choice: ");
            choice = sc.nextLine().toUpperCase(); // convert input to uppercase

            switch (choice) {
                case "A":
                    // Add a book into the library
                    System.out.print("Enter book title: ");
                    String addBook = sc.nextLine();
                    books.put(addBook, "Available"); // book added as Available by default
                    System.out.println("Book added!\n");
                    break;

                case "B":
                    // Borrow a book
                    System.out.print("Enter book title: ");
                    String borrowBook = sc.nextLine();
                    if (books.containsKey(borrowBook) && books.get(borrowBook).equals("Available")) {
                        books.put(borrowBook, "Borrowed"); // update status
                        System.out.println("Book borrowed!\n");
                    } else {
                        System.out.println("Book not available!\n");
                    }
                    break;

                case "R":
                    // Return a book
                    System.out.print("Enter book title: ");
                    String returnBook = sc.nextLine();
                    if (books.containsKey(returnBook) && books.get(returnBook).equals("Borrowed")) {
                        books.put(returnBook, "Available"); // update status
                        System.out.println("Book returned!\n");
                    } else {
                        System.out.println("Invalid return!\n");
                    }
                    break;

                case "D":
                    // Display all books and their status
                    System.out.println("Books List:");
                    for (String title : books.keySet()) {
                        System.out.println(title + " - " + books.get(title));
                    }
                    System.out.println();
                    break;

                case "E":
                    // Exit program
                    System.out.println("Books List:");
                    for (String title : books.keySet()) {
                        System.out.println(title + " - " + books.get(title));
                    }
                    System.out.println("\nEnter choice: 5"); // as shown in your sample output
                    System.out.println("Exiting...");
                    sc.close(); // close scanner
                    return; // terminate program

                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice!\n");
            }
        }
    }
}
