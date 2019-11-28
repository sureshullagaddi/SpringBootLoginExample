package com.springboot.loginexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.loginexample.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
