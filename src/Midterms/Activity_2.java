package Midterms;
import java.util.LinkedList;
import java.util.Scanner;


public class Activity_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        // Input of 5 number
        System.out.println("=== Activity 2 ===");
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) { // Once done imputing it will ask for 5
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        //Print
        System.out.println("\nYou entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nOver all total of the input: " + numbers.size());
        scanner.close(); // Close scanner to prevent resource leak
    }
}                     // Exit option
//                     System.out.println("Exiting program. Goodbye!");
