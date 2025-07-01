package projects.librarymanagement;

public class Book {

    private String name;
    private String author;
    private int year;
    private String rentTo;
    private int stock;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.stock = 1;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setRentTo(String username) {
        this.rentTo = username;
    }

    public void addStock() {
        this.stock++;
    }

    public void addStock(int amount) {
        if (amount < 0) {
            return;
        }

        this.stock += amount;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.author + ", " + this.year + ". Copies: " + this.stock;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Book)) {
            return false;
        }

        Book compared = (Book) object;

        if (this.name.equals(compared.name) &&
            this.author.equals(compared.author) &&
            this.year == compared.year) {
            return true;
        }

        return false;
    }
}
