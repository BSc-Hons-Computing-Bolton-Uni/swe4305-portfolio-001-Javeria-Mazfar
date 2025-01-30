package LogBook.Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("Original Order: " + num1 + " " + num2);

        // Swapping
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Reversed Order: " + num1 + " " + num2);
    }
}







