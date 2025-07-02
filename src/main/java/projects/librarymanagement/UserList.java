package projects.librarymanagement;

import java.util.List;
import java.util.ArrayList;

public class UserList {

    private List<Person> users;

    public UserList() {
        this.users = new ArrayList<>();
    }

    public void addUser(String name, int age, String username, String password, UserType userType) {
        int nextIndex = this.users.size();
        if (userType.equals(UserType.ADMIN)) {
            this.users.add(new Admin(name, age, username, password, nextIndex));
        }

        if (userType.equals(UserType.BORROWER)) {
            this.users.add(new Borrower(name, age, username, password, nextIndex));
        }

        if (userType.equals(UserType.STAFF)) {
            this.users.add(new Staff(name, age, username, password, nextIndex));
        }
    }
}
