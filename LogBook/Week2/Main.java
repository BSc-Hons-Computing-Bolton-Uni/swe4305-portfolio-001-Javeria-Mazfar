package LogBook.Week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your exam mark (0-100): ");
        int mark = scanner.nextInt();

        // Determine and print the grade based on the mark
        if (mark >= 70) {
            System.out.println("Grade: A");
        } else if (mark >= 60) {
            System.out.println("Grade: B");
        } else if (mark >= 50) {
            System.out.println("Grade: C");
        } else if (mark >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}






