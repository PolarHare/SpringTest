package com.polarnick.test.server.service;

import com.polarnick.test.server.entities.User;
import com.polarnick.test.server.entities.UserCredential;

/**
 * @author Polyarnyi Nikolay
 */
public interface UserService {

    UserCredential getUserCredential(String login);

    User getUser(String login);

}
