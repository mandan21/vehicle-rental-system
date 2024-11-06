package za.co.protogen.core.impl;

import za.co.protogen.core.UserService;
import za.co.protogen.domain.User;
import za.co.protogen.utility.Constant;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser(User user) {
        Constant.users.add(user);
    }

    @Override
    public void removeUser(Long id) {
        Constant.users.removeIf(user -> user.getId().equals(id));
    }

    @Override
    public User getUserById(Long id) {
        return Constant.users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return Constant.users;
    }

    @Override
    public void updateUser(User user) {
        for (int i = 0; i < Constant.users.size(); i++) {
            if (Constant.users.get(i).getId().equals(user.getId())) {
                Constant.users.set(i, user);
                return;
            }
        }
    }

    @Override
    public List<User> searchUsers(String firstName, String lastName) {
        return Constant.users.stream()
                .filter(user -> (firstName == null || user.getFirstName().equalsIgnoreCase(firstName)) &&
                        (lastName == null || user.getLastName().equalsIgnoreCase(lastName)))
                .collect(Collectors.toList());
    }
}
