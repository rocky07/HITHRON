package com.bourntec.HITHRON.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bourntec.HITHRON.dvo.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{
    
}
