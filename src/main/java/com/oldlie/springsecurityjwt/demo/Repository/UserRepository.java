package com.oldlie.springsecurityjwt.demo.Repository;

import com.oldlie.springsecurityjwt.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
