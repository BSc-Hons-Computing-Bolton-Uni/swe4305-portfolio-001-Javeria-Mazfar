package LogBook.Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double deposit = scanner.nextDouble();

        double interestRate = 0.01;
        double interest = deposit * interestRate;
        double totalAmount = deposit + interest;

        System.out.println("Interest: " + interest);
        System.out.println("Total  after interest: " + totalAmount);
    }
}











