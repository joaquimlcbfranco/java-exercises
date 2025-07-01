package projects.librarymanagement;

import java.util.List;
import java.util.ArrayList;

public class BookList {

    private List<Book> books;

    public BookList() {
        this.books = new ArrayList<>();
    }

    public void addBook(String name, String author, int year) {
        if (!this.books.contains(new Book(name, author, year))) {
            books.add(new Book(name, author, year));
            return;
        }

        for (Book book : books) {
            if (book.equals(new Book(name, author, year))) {
                book.addStock();
            }
        }
    }

    public void printBooks() {
        books.stream()
                .forEach(book -> book.toString());
    }
}
