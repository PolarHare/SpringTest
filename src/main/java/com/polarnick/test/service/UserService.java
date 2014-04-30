package com.polarnick.test.service;

import com.polarnick.test.entities.User;
import com.polarnick.test.entities.UserCredential;

/**
 * @author Polyarnyi Nikolay
 */
public interface UserService {

    UserCredential getUserCredential(String login);

    User getUser(String login);

}
