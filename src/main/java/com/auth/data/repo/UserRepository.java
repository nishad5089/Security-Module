package com.auth.data.repo;

import com.auth.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abdur Rahim Nishad
 * @created 23/02/2021 - 12:50 AM
 * @project authmodule
 */

public interface UserRepository extends JpaRepository<User, String> {
}
