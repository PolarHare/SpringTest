package com.polarnick.test.entities;

/**
 * @author Polyarnyi Nikolay
 */
public class User {

    String login;
    String password;
    String name;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
