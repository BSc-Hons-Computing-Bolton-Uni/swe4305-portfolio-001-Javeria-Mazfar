package LogBook.Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        double perimeter = 2 * (length + height);
        double area = length * height;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}




