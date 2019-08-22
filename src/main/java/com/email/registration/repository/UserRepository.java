package com.email.registration.repository;


import com.email.registration.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLoginOrEmail(@Param("login") String login, @Param("email") String email);

}
