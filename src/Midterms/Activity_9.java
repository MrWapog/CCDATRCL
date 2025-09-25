package Midterms;

import java.util.HashMap;
import java.util.Scanner;

public class Activity_9 {
    public static void main(String[] args) {
        // HashMap to store books and their status (Available / Borrowed)
        HashMap<String, String> books = new HashMap<>();
        // HashMap to store borrower information (book -> who borrowed)
        HashMap<String, String> borrowers = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String choice;

        // Initial menu display
        System.out.println("Library Book Tracker");
        System.out.println("[A]Add [B]Borrow [R]Return [DA]Display Available Books [DR]Display Returned [DAB]Display All Available Books [SH]Show History [E]Exit");

        while (true) {
            // Ask user for their choice
            System.out.print("\nEnter choice: ");
            choice = sc.nextLine().toUpperCase(); // convert input to uppercase

            switch (choice) {
                case "A":
                    // Add a book into the library
                    System.out.print("Enter book title: ");
                    String addBook = sc.nextLine();
                    books.put(addBook, "Available"); // book added as Available by default
                    System.out.println("Book added!");
                    break;

                case "B":
                    // Borrow a book if it is available
                    System.out.print("Enter book title: ");
                    String borrowBook = sc.nextLine();
                    if (books.containsKey(borrowBook) && books.get(borrowBook).equals("Available")) {
                        System.out.print("Enter borrower name: ");
                        String borrower = sc.nextLine();
                        books.put(borrowBook, "Borrowed");
                        borrowers.put(borrowBook, borrower); // save borrower name
                        System.out.println("Book borrowed!");
                    } else {
                        System.out.println("Book not available!");
                    }
                    break;

                case "R":
                    // Return a book if it was borrowed
                    System.out.print("Enter book title: ");
                    String returnBook = sc.nextLine();
                    if (books.containsKey(returnBook) && books.get(returnBook).equals("Borrowed")) {
                        books.put(returnBook, "Available"); // update status
                        System.out.println("Book returned!");
                    } else {
                        System.out.println("Invalid return!");
                    }
                    break;

                case "DR":
                    // Display only borrowed books
                    System.out.println("Borrowed Books:");
                    for (String title : books.keySet()) {
                        if (books.get(title).equals("Borrowed")) {
                            System.out.println(title + " – " + borrowers.get(title));
                        }
                    }
                    break;

                case "DA":
                case "DAB":
                    // Display only available books
                    System.out.println("Available Books:");
                    for (String title : books.keySet()) {
                        if (books.get(title).equals("Available")) {
                            System.out.println(title + " - Available");
                        }
                    }
                    break;

                case "SH":
                    // Show borrowing history
                    System.out.println("Borrowing History:");
                    for (String title : borrowers.keySet()) {
                        System.out.println(title + ": [" + borrowers.get(title) + "]");
                    }
                    break;

                case "E":
                    System.out.println("Exiting...");
                    sc.close(); // close scanner
                    return; // terminate program

                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice!");
            }
        }
    }
}

