package projects.librarymanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookList books = new BookList();
        books.addBook("To Kill a Mockingbird", "Harper Lee", 1960);
        books.addBook("1984", "George Orwell", 1949);
        books.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        books.addBook("Pride and Prejudice", "Jane Austen", 1813);
        books.addBook("The Catcher in the Rye", "J.D. Salinger", 1951);

        UserInterface ui = new UserInterface(scanner, books);
        ui.startUI();
    }
}
