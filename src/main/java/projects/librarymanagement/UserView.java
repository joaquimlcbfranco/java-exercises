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
        System.out.println("Welcome to Joaquim's Library. Feel free to search or rent books!");
        this.printOptions();

        while (true) {
            String input = scanner.nextLine();

            if (this.isNumber(input)) {
                int number = Integer.valueOf(input);

                if (number == 0) {
                    break;
                }

                if (number == 1) {
                    
                }

                if (number == 3) {
                    this.books.printBooks();
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("1. Login 2. Create Account; 3. List Books; 4. Admin Panel; 0. Quit");
                    System.out.println("---------------------------------------------------------------------");
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
        System.out.println("1. Login");
        System.out.println("2. Create Account");
        System.out.println("3. List Available Books");
        System.out.println("4. Admin Panel");
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
