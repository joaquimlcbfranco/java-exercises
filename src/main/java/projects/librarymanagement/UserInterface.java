package projects.librarymanagement;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private BookList books;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.books = new BookList();
    }

    public void startUI() {
        this.printOptions();

        while (true) {
            String input = scanner.nextLine();

            if (this.isNumber(input)) {
                int number = Integer.valueOf(input);

                if (number == 0) {
                    break;
                }

                if (number == 1) {
                    AdminInterface ai = new AdminInterface(this.scanner);
                    ai.startAI();
                    break;
                }

                if (number == 2) {
                    this.books.printBooks();
                    this.printOptions();
                }

            } else {
                System.out.println("Please choose a valid number.");
                this.printOptions();
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
