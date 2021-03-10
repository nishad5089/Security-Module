package com.auth.service;

import com.auth.data.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Abdur Rahim Nishad
 * @created 23/02/2021 - 12:51 AM
 * @project authmodule
 */

public interface UserService {
    User createUser(User user);
}
