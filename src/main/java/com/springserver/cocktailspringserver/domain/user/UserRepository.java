package com.springserver.cocktailspringserver.domain.user;

import com.springserver.cocktailspringserver.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}