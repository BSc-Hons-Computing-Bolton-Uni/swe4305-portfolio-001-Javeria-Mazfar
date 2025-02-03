package LogBook.Week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int currentYear = 2025;  // Change if the current year changes
        int yearOfBirth = currentYear - age;

        System.out.println("You were born in " + yearOfBirth);

        if(age >= 18)

            System.out.println("You're 18 years old or over.");

          else

             System.out.println("You're under 18.");



        }
    }

