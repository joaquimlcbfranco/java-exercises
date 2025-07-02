package projects.librarymanagement;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private BookList books;

    public UserInterface(Scanner scanner, BookList books) {
        this.scanner = scanner;
        this.books = books;
    }

    public void startUI() {
        System.out.println("Welcome to Joaquim's Library Management System!");
        this.printOptions();

        while (true) {
            String input = scanner.nextLine();

            if (this.isNumber(input)) {
                int number = Integer.valueOf(input);

                if (number == 0) {
                    break;
                }

                if (number == 1) {
                    AdminInterface ai = new AdminInterface(this.scanner, this.books);
                    ai.startAI();
                    break;
                }

                if (number == 2) {
                    this.books.printBooks();
                    System.out.println("-------------------------");
                    System.out.println("1. Admin Login; 2. List; 3. Rent; 0. Quit");
                    System.out.println("-------------------------");
                }

            } else {
                System.out.println("Please choose a valid number:");
                System.out.println("-------------------------");
                System.out.println("1. Admin Login; 2. List; 3. Rent; 0. Quit");
                System.out.println("-------------------------");
            }

        }
    }

    public void printOptions() {
        System.out.println("-------------------------");
        System.out.println("1. Admin Login");
        System.out.println("2. List Available Books");
        System.out.println("3. Rent a Book");
        System.out.println("0. Quit");
        System.out.println("-------------------------");
    }

    public boolean isNumber(String input) {
        try {
            Integer.valueOf(input);
            return true;
        } catch (Exception error) {
            return false;
        }
    }
}
