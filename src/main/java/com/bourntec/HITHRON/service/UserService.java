package com.bourntec.HITHRON.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bourntec.HITHRON.dvo.UserEntity;
import com.bourntec.HITHRON.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;
    
    @Transactional
    public UserEntity getUserById(Integer userId, Boolean flag){
        UserEntity user;
        Optional<UserEntity> userOptional = userRepo.findById(userId);
        user= userOptional.orElseThrow();
        if(flag){
            user.getAddress().size();
        }
        return user;
    }    

    public void saveUser(UserEntity user){
        userRepo.save(user);
    }

    public List<UserEntity> findAllUser(){
        return userRepo.findAll();
    }
}
