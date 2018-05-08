package com.oldlie.springsecurityjwt.demo.Repository;

import com.oldlie.springsecurityjwt.demo.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
