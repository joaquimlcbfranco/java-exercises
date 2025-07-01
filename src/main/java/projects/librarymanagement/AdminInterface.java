package projects.librarymanagement;

import java.util.Scanner;

public class AdminInterface {

    private Scanner scanner;

    public AdminInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startAI() {
        while (true) {
            System.out.println("Welcome to the Admin Interface! (0 to quit)");
            System.out.println("Username: ");
            String username = scanner.nextLine();
            if (username.equals("0")) {
                new UserInterface(scanner).startUI();
                break;
            }
            System.out.println("Password: ");
            String password = scanner.nextLine();
            if (password.equals("0")) {
                new UserInterface(scanner).startUI();
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
