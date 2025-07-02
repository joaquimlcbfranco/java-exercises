package projects.librarymanagement;

public class Admin extends Person {

    private int salary;

    public Admin(String name, int age, String username, String password, int salary) {
        super(name, age, username, password);
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public void printDetails() {
        System.out.println(this.name + ", " + this.age + " years old. Salary: " + this.salary + "€/month.");
    }
}
