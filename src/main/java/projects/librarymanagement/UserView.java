package projects.librarymanagement;

import java.util.Scanner;

public class UserView {

    private Scanner scanner;
    private BookList books;

    public UserView(Scanner scanner, BookList books) {
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
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();


                }

                if (number == 3) {
                    this.books.printBooks();
                    System.out.println("------------------------------------------------");
                    System.out.println("1. Login; 2. List Books; 3. Admin Panel; 0. Quit");
                    System.out.println("------------------------------------------------");
                }

            } else {
                System.out.println("Please choose a valid number:");
                System.out.println("------------------------------------------------");
                System.out.println("1. Login; 2. List Books; 3. Admin Panel; 0. Quit");
                System.out.println("------------------------------------------------");
            }

        }
    }

    public void printOptions() {
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. List Available Books");
        System.out.println("3. Admin Panel");
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
