package projects.librarymanagement;

public class Admin extends Person {

    private int salary;

    public Admin(String name, int age, String username, String password, int userId) {
        super(name, age, username, password, userId);
        this.salary = 1000;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public void printDetails() {
        System.out.println(this.name + ", " + this.age + " years old. Salary: " + this.salary + "€/month.");
    }
}
