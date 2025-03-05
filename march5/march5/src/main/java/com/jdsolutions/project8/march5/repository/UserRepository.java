package com.jdsolutions.project8.march5.repository;

import com.jdsolutions.project8.march5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
