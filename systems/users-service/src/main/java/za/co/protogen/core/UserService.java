package za.co.protogen.core;

import za.co.protogen.domain.User;

import java.util.List;

public interface UserService {
    void addUser(User user); // Adds a new user
    void removeUser(Long id); // Removes a user
    User getUserById(Long id); // Retrieves a user by ID
    List<User> getAllUsers(); // Retrieves all users
    void updateUser(User user); // Updates user information
    List<User> searchUsers(String firstName, String lastName); // Searches for users
}
