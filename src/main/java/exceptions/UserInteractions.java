package exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInteractions {
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private LocalDate birthDate;
    private int integerNumber;
    private double doubleNumber;

    public void getUserData() {
        boolean dateException = true;
        boolean intException = true;
        boolean doubleException = true;
        while (true) {
            try {
                if(dateException) {
                    System.out.println("Podaj imię");
                    name = scanner.nextLine();
                    System.out.println("Podaj datę urodzenia");
                    birthDate = LocalDate.parse(scanner.nextLine());  // wprowadzam napis i parsuje do daty
                    dateException = false;
                }
                if(intException) {
                    System.out.println("Podaj liczbę całkowitą");
                    integerNumber = scanner.nextInt();
                    intException = false;
                }
                if(doubleException){
                    System.out.println("Podaj liczbę zmiennprzecinkową");
                    doubleNumber = scanner.nextDouble();
                    System.out.printf("Twoje dane: %s, %s, %d, %f\n", name, birthDate, integerNumber, doubleNumber);
                    doubleException = false;
                }
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Podałeś błędną datę");
            } catch (InputMismatchException e) {
                System.out.println("Podałeś błędną liczbę");
            } finally {
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        UserInteractions ui = new UserInteractions();
        ui.getUserData();
    }
}