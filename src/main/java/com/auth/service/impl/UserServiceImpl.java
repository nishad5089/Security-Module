package com.auth.service.impl;

import com.auth.data.entity.User;
import com.auth.data.repo.UserRepository;
import com.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Abdur Rahim Nishad
 * @created 23/02/2021 - 12:52 AM
 * @project authmodule
 */
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
