package com.polarnick.test.server.service;

import com.polarnick.test.server.entities.User;
import com.polarnick.test.server.entities.UserCredential;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Polyarnyi Nikolay
 */
@Service
public class InMemoryUserService implements UserService {

    private final Map<String, UserCredential> usersCredential;
    private final Map<String, User> users;

    public InMemoryUserService() {
        this.usersCredential = new HashMap<>();
        String login = "user";
        String password = "7110eda4d09e062aa5e4a390b0a572ac0d2c0220";//"1234" by SHA1 encryption
        this.usersCredential.put(login, new UserCredential(login, password));

        this.users = new HashMap<>();
        String name = "Пользователь";
        int age = 20;
        this.users.put(login, new User(name, age));
    }

    @Override
    public UserCredential getUserCredential(String login) {
        return usersCredential.get(login);
    }

    @Override
    public User getUser(String login) {
        return users.get(login);
    }

}
