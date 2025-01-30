package LogBook.Week1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your date of birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();

        long daysOld = ChronoUnit.DAYS.between(birthDate, currentDate);

        System.out.println("You are " + daysOld + " days old.");
    }
}









