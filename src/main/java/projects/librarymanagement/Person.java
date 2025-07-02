package projects.librarymanagement;

public abstract class Person {

    protected String name;
    protected int age;
    protected String username;
    protected String password;

    public Person(String name, int age, String username, String password) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    };

    public int getAge() {
        return this.age;
    }

    public void printDetails() {
        System.out.println(this.name + ", " + this.age + " years old.");
    }
}
