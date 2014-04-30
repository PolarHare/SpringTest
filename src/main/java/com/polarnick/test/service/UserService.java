package com.polarnick.test.service;

import com.polarnick.test.entities.User;

/**
 * @author Polyarnyi Nikolay
 */
public interface UserService {

    User getUser(String login);

}
