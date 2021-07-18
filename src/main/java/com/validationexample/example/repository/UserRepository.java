package com.validationexample.example.repository;

import com.validationexample.example.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
