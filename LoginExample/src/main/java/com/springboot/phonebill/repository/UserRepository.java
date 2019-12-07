package com.springboot.phonebill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.phonebill.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
