package com.ecommerce.ecommerce.feature.user_management.domain.repository;

import com.ecommerce.ecommerce.feature.user_management.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
