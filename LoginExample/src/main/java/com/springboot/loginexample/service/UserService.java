package com.springboot.loginexample.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.loginexample.entity.Users;
import com.springboot.loginexample.repository.UserRepository;

@Service
@Transactional
public class UserService { 
	
	@Autowired
    private UserRepository repo;
     
    public List<Users> listAll() {
        return repo.findAll();
    }
     
    public void save(Users user) {
        repo.save(user);
    }
     
    public Users get(long id) {
        return repo.findOne(id);
    }
    
//    public void delete(long id) {
//        repo.deleteById(id);
//    }
     
}
