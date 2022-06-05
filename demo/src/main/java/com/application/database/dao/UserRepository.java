package com.application.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.application.database.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//    Spring Boot JPA is a Java specification for
//    managing relational data in Java applications.
//    It allows us to access and persist data between
//    Java object/ class and relational database.
}