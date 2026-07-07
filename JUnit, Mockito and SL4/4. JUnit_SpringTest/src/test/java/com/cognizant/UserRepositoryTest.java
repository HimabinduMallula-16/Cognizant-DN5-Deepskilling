package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.cognizant.entity.User;
import com.cognizant.repository.UserRepository;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByName() {

        // Create Users
        User user1 = new User();
        user1.setId(1L);
        user1.setName("Rahul");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Rahul");

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Priya");

        // Save Users
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        // Execute Custom Query
        List<User> users = userRepository.findByName("Rahul");

        // Verify Results
        assertEquals(2, users.size());

        assertEquals("Rahul", users.get(0).getName());

    }

}