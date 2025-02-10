package LogBook.Week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Ask the user for a number to print its times table
            System.out.print("Enter the number for the times table: ");
            int num = scanner.nextInt();

            // Loop to print the chosen times multiplication table
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " x " + num + " = " + (i * num));
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to see another times table? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        // Print goodbye message if the user decides to stop
        System.out.println("Goodbye!");
    }
}





