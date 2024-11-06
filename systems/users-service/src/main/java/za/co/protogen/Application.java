package za.co.protogen;

import za.co.protogen.core.UserService;
import za.co.protogen.core.impl.UserServiceImpl;
import za.co.protogen.domain.User;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Display all users
        System.out.println("All users: " + userService.getAllUsers());

        // Creating a new user
        User newUser = new User();
        newUser.setId(3L); // Ensure unique ID
        newUser.setFirstName("Alice");
        newUser.setLastName("Johnson");
        newUser.setDateOfBirth(LocalDate.of(1992, 3, 10));
        newUser.setRsaId("1122334455667");

        // Adding the new user
        userService.addUser(newUser);
        System.out.println("User added. All users: " + userService.getAllUsers());
    }
}
