package za.co.protogen.utility;

import za.co.protogen.domain.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Constant {
    public static List<User> users = new ArrayList<>();

    static {
        // Add mock data
        User user1 = new User();
        user1.setId(1L);
        user1.setFirstName("John");
        user1.setLastName("Doe");
        user1.setDateOfBirth(LocalDate.of(1990, 1, 1));
        user1.setRsaId("1234567890123");
        users.add(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setFirstName("Jane");
        user2.setLastName("Smith");
        user2.setDateOfBirth(LocalDate.of(1985, 6, 15));
        user2.setRsaId("9876543210987");
        users.add(user2);

        User user3 = new User();
        user2.setId(2L);
        user2.setFirstName("James");
        user2.setLastName("Bond");
        user2.setDateOfBirth(LocalDate.of(1985, 6, 15));
        user2.setRsaId("8576543210987");
        users.add(user3);

        User user4 = new User();
        user2.setId(2L);
        user2.setFirstName("Lerato");
        user2.setLastName("Moyana");
        user2.setDateOfBirth(LocalDate.of(1985, 6, 15));
        user2.setRsaId("85615543210987");
        users.add(user4);

        User user5 = new User();
        user2.setId(2L);
        user2.setFirstName("Amanda");
        user2.setLastName("Nyalivane");
        user2.setDateOfBirth(LocalDate.of(2000, 8, 15));
        user2.setRsaId("0008150178088");
        users.add(user5);


    }
}
