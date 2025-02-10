package LogBook.Week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the times table: ");
        int num = scanner.nextInt();

        // Loop to print the chosen times multiplication table
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }
}





