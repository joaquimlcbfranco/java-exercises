package projects.librarymanagement;

import java.util.List;
import java.util.ArrayList;

public class BookList {

    private List<Book> books;

    public BookList() {
        this.books = new ArrayList<>();
    }

    public int getId() {
        return this.books.size();
    }

    public int getId(Book book) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).equals(book)) {
                return i;
            }
        }

        return -1;
    }

    public void addBook(String name, String author, int year) {
        Book newBook = new Book(this.getId(), name, author, year);
        if (!this.books.contains(newBook)) {
            books.add(new Book(this.getId(), name, author, year));
            return;
        }

        for (Book book : books) {
            if (book.equals(newBook)) {
                book.addStock();
            }
        }
    }

    public void printBooks() {

        books.stream()
                .forEach(book -> System.out.println(book.toString()));
    }
}
