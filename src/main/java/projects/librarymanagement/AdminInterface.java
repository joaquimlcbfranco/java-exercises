package projects.librarymanagement;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AdminInterface {

    private Scanner scanner;
    private BookList books;

    public AdminInterface(Scanner scanner, BookList books) {
        this.scanner = scanner;
        this.books = books;
    }

    public void startAI() {
        while (true) {
            System.out.println("Welcome to the Admin Interface! (0 to quit)");
            System.out.println("Username: ");
            String username = scanner.nextLine();
            if (username.equals("0")) {
                new UserInterface(scanner, books).startUI();
                break;
            }
            System.out.println("Password: ");
            String password = scanner.nextLine();
            if (password.equals("0")) {
                new UserInterface(scanner, books).startUI();
                break;
            }

            this.printOptions();
        }
    }

    public void printOptions() {
        System.out.println("-------------------------");
        System.out.println("1. Add a Book");
        System.out.println("2. List Available Books");
        System.out.println("3. Remove a Book");
        System.out.println("0. Quit");
        System.out.println("-------------------------");
    }
}
