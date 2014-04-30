package com.polarnick.test.service;

import com.polarnick.test.entities.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Polyarnyi Nikolay
 */
@Service
public class InMemoryUserService implements UserService {

    private final Map<String, User> users;

    public InMemoryUserService() {
        this.users = new HashMap<>();
        String login = "userL";
        String password = "7110eda4d09e062aa5e4a390b0a572ac0d2c0220";//"1234" by SHA1 encryption
        String name = "Пользователь";
        this.users.put(login, new User(login, password, name));
    }

    @Override
    public User getUser(String login) {
        return users.get(login);
    }

}
