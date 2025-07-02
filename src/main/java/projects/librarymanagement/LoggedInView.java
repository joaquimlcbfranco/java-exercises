package projects.librarymanagement;

import java.util.Scanner;

public class LoggedInView {

    private Scanner scanner;

    public LoggedInView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startLI() {
        System.out.println("Successfully logged in!");

    }

    public void printOptions() {
        System.out.println("-------------------------");
        System.out.println("1. List Available Book");
        System.out.println("2. ");
        System.out.println("3. List Available Books");
        System.out.println("4. Admin Panel");
        System.out.println("0. Quit");
        System.out.println("-------------------------");
    }
}
