package com.prog.repository;

import org.springframework.data.repository.CrudRepository;

import com.prog.entity.User_Dtls;

public interface UserRepository extends CrudRepository<User_Dtls, Integer> {

}
