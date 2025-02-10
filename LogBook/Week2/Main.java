package LogBook.Week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your letter grade (A-F): ");
        char grade = scanner.next().charAt(0);

        // Convert letter grade to university classification
        switch (grade) {
            case 'A':
                System.out.println("1st");
                break;
            case 'B':
                System.out.println("2:1");
                break;
            case 'C':
                System.out.println("2:2");
                break;
            case 'D':
                System.out.println("3rd");
                break;
            case 'E':
                System.out.println("ordinary");
                break;
            case 'F':
                System.out.println("fail");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}


