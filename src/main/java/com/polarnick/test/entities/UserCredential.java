package com.polarnick.test.entities;

/**
 * @author Polyarnyi Nikolay
 */
public class UserCredential {

    String login;
    String password;

    public UserCredential(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
