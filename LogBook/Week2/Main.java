package LogBook.Week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is 18 or older
        if (age >= 18) {
            System.out.println("You are 18 or older.");
        } else {
            System.out.println("You are younger than 18.");
        }
    }
}

