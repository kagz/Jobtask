package com.hustle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hustle.model.User;


public interface UserRepository extends CrudRepository<User, Long>{

}
