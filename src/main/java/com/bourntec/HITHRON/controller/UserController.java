package com.bourntec.HITHRON.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bourntec.HITHRON.dvo.UserEntity;
import com.bourntec.HITHRON.service.UserService;

@RestController
@RequestMapping("/user")
public
class UserController{

    @Autowired
    UserService userService;

    //test service 
    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
    //create user
    @PostMapping
    public void addUser(@RequestBody UserEntity userEntity){
        userService.saveUser(userEntity);
    }
    //edit user
    @PutMapping
    public void updateUser(@RequestBody UserEntity userEntity){
        userService.saveUser(userEntity);
    }
    //list all users
    @GetMapping
    public List<UserEntity>  getUserList(){
        return userService.findAllUser();
    }

    @GetMapping("/{id}/{flag}")
    public UserEntity getUserById(@PathVariable("id") Integer userId,@PathVariable("flag") Boolean flag){
        return userService.getUserById(userId,flag);
    }
}