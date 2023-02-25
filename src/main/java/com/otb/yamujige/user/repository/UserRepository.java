package com.otb.yamujige.user.repository;

import com.otb.yamujige.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
